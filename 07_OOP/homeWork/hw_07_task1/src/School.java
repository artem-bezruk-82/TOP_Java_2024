public final class School
{
    private School(){}

    public static void callPersonToDuty(Person person)
    {
        System.out.println(person.performDuty());
    }

    public static void makePersonWork(Person person)
    {
        String work = switch (person.getClass().getName())
        {
            case "Student" -> ((Student)person).study();
            case "Teacher" -> ((Teacher)person).teach();
            case "Principal" -> ((Principal)person).manage();
            default -> "";
        };

        System.out.println(work);
    }
}
