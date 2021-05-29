package JavaClasses.day22_string_monioulation;

public class IndexOfExample {
    public static void main(String[] args){
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java ");
        System.out.println("java is at index" + indexOfJava);
        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + indexOfCss);
        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);
        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is not at index: " + indexOfSql);

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") > 1){
            System.out.println(("maven is prssent "));
        }else{
            System.out.println("maven is not present");
        }






    }

}
