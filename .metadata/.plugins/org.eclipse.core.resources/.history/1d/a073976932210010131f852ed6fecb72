package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeAndLocation {
    private static final String GEO_API_URL = "http://ip-api.com/json";

    public static void main(String[] args) throws Exception {
        printCurrentTime();
        printCurrentLocation();
    }

    private static void printCurrentTime() {
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime now = ZonedDateTime.now(zone);
        String formatted = now.format(
            DateTimeFormatter.ofPattern("EEEE, MMMM d, uuuu HH:mm:ss z", Locale.getDefault())
        );
        System.out.println("Current time: " + formatted);
    }

    private static void printCurrentLocation() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest  req = HttpRequest.newBuilder()
                             .uri(URI.create(GEO_API_URL))
                             .GET()
                             .build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        String json = resp.body();

        if (!json.contains("\"status\":\"success\"")) {
            System.err.println("Geolocation API failed: " + json);
            return;
        }

        // crude helper: find the value after "key":
        String city   = extract(json, "\"city\":\"",   '"');
        String region = extract(json, "\"regionName\":\"", '"');
        String country= extract(json, "\"country\":\"", '"');
        String latStr = extract(json, "\"lat\":",       ',');
        String lonStr = extract(json, "\"lon\":",       ',');

        System.out.printf(
            "Approximate location: %s, %s, %s (lat=%s, lon=%s)%n",
            country, city, region, latStr, lonStr
        );
    }

    private static String extract(String json, String key, char endChar) {
        int idx = json.indexOf(key);
        if (idx < 0) return "N/A";
        int start = idx + key.length();
        int end   = json.indexOf(endChar, start);
        if (end < 0) end = json.length();
        return json.substring(start, end);
    }
}
