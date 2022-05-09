package hu.progmatic.oop_03_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CrewMember[] crewMembers = {
                new CrewMember(1, "kovács józsef", Role.ACTOR),
                new CrewMember(2, "kiss istván", Role.ACTOR),
                new CrewMember(3, "nagy anna", Role.DIRECTOR),
                new CrewMember(4, "mekk elek", Role.TECHNICIAN)
        };

        List<CrewMember> actors = new ArrayList<>();

        for (CrewMember crewMember : crewMembers) {
            if (crewMember.getRole() == Role.ACTOR) {
                actors.add(crewMember);
            }
        }

        actors.add(0, new CrewMember(5, "szep elvira", Role.ACTOR));

        for (CrewMember actor : actors) {
            System.out.println(actor);
        }


    }
}
