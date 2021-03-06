package JavaClasses.day48_constructor_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");

        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1);

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andrea", "Andrey"));
        System.out.println("group2 members - " + group1.getMembers());


        group1.removeMember("Pavel");
        group1.removeMember("Parvin");
        System.out.println(group1);


    }
}
