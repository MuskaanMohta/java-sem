class Course{
    String name="";
    String code="";
    Course(String name,String code){
        this.name=name;
        this.code=code;

    }
    String getCourse()
    {
        return (code+"|"+name) ;
    }
}