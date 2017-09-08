public enum enumMake
{
    adnan("student", 22);

    private final String job;
    private final int age;

    enumMake (String jobP, int ageP)
    {
        job = jobP;
        age = ageP;
    }

    public String getJob()
    {
        return job;
    }
    public int getAge()
    {
        return age;
    }

    public static void main (String[]args)
    {
        for (enumMake employees: enumMake.values())
        {
            System.out.printf("%s\t%s\t%s\n", employees, employees.getJob(), employees.getAge());
        }
    }
}