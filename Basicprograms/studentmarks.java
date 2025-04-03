//If the marks obtained by a student in five different subjects are input through the keyboard, find out the aggregate marks and percentage marks obtained by the student. Assume that the maximum marks that can be obtained by a student in each subject is 100
class studentmarks 
{
    public static void main(String[] args) 
{
        
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        int subject4 = 88;
        int subject5 = 92;

        int aggregateMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (aggregateMarks/500.0f)*100;
        System.out.println("Aggregate Marks: " + aggregateMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
