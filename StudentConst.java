class StudentConst {
    
    StudentConst(String name, int roll)
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
    }
    
    public static void main(String[] args) {
        StudentConst s1 = new StudentConst("Mireia Liang", 42);
        StudentConst s2 = new StudentConst("Lauri Dickman", 69);
        StudentConst s3 = new StudentConst("Regina Phalange", 24);
    }
}
