package com.egypteam.test.prolog;

import jpl.Atom;
import jpl.Query;
import jpl.Term;
import jpl.fli.term_t;

import java.util.Map;


/**
 * Created by pedrofmj on 17/01/15.
 */
public class Main {

    public static void main(String[] args) {

        Atom a = new Atom("test");

        Query q1 =
                new Query(
                        "consult",
                        new Term[] { new Atom("/home/pedrofmj/Projects/Idea/EgypTeam/Artificial Intelligence/Khalid/prologtest/src/com/egypteam/test/logtalk/resource/test.pl") }
                );

        System.out.println( "consult " + (q1.query() ? "succeeded" : "failed"));

        Query q2 =
                new Query(
                        "child_of",
                        new Term[] {new Atom("joe"),new Atom("ralf")}
                );
        System.out.println(
                "child_of(joe,ralf) is " +
                        ( q2.query() ? "provable" : "not provable" )
        );

        Query q3 =
                new Query(
                        "descendent_of",
                        new Term[] {new Atom("steve"),new Atom("ralf")}
                );
        System.out.println(
                "descendent_of(steve,ralf) is " +
                        ( q3.query() ? "provable" : "not provable" )
        );

        /*
        Term[] terms = {new Atom("")};

        Query q1 = new Query(
            "consult",
            terms
        );

        System.out.println("consult " + (q1.query() ? "succeded" : "failed"));
        */

    }

}
