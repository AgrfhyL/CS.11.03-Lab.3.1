import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int securityDanger = 0;
        String loseMessage = "HAHA YOU FAILED!! You got caught. Better start thinking about applications to HKIS.";
        String winMessage = "Good Job! You escaped detention!";
        System.out.println("Just another ordinary day. You are walking in the school 6th floor hallway. (Press enter/return key to continue)");
        skipForward();
        System.out.println("You take out your phone to look at the time:");
        skipForward();
        System.out.println("10:27");
        skipForward();
        Scanner console = new Scanner(System.in);
        System.out.println("It's break time, you probably shouldn't be looking at your phone at all.");
        System.out.println("Do you wanna put it back (return the letter, no caps):" + "\n" + "a. yes" + "\n" + "b. no" );
        String userReturn = console.nextLine();
        if (userReturn.contains("a")) {
            System.out.println("Just as you were about to put the phone back, Mr. Ng pops up and yells:" + "\n" + "It's a tech-free break! Give me your phone!" + "\n" + "YOU ARE GOING TO DETENTION!!!");
            skipForward();
        } else {
            System.out.println("Just as you check your surroundings for teachers, Mr. Ng pops up and yells:" + "\n" + "It's a tech-free break! Give me your phone!" + "\n" + "YOU ARE GOING TO DETENTION!!!");
            skipForward();
        }
        System.out.println("Well kid... He's not gonna listen to you. You better run!");
        skipForward();
        System.out.println("Here's a little tip: He'll be alerting security and teachers, when too many (100%) are alert, you'll definitely get caught. Pick choices wisely.");
        System.out.println("Mr. Ng is coming at you:" + printParameters(securityDanger)+ "\n" + "a. run" + "\n" + "b. run" + "\n" + "c. run" + "\n" + "d. run");
        userReturn = console.nextLine();
        System.out.println("We're outta here, but which direction do we go:" + "\n" + "a. right into Mr. Ng" + "\n" + "b. downstairs (l5)");
        userReturn = console.nextLine();
        if (picksChoice(userReturn, "a")) { //a, RIGHT INTO NG
            securityDanger = alterParameters(securityDanger, random67(), true);
            System.out.println("Now this is clearly not a good choice! PLAY SERIOUSLY! To punish you, the alertness of teachers and security is increased to 25% :(" + "\n" + "b. downstairs (l5)");
            securityDanger = alterParameters(securityDanger, 25, true);
            System.out.println("You arrive on the 5th floor, where do you wanna go now:" + printParameters(securityDanger) + "\n" + "a. into a bathroom" + "\n" + "b. to Mr. Ewing's room" + "\n" + "c. to INSO classroom");
            userReturn = console.nextLine();
            if (userReturn.contains("a")) { // if a, into a bathrooom
                System.out.println("You run into the bathroom and close the door. However, there are multiple students being lectured by Mr. Mulcahy for using there phones in the bathroom.");
                if (!securityAtAbove(securityDanger, 25)) {
                    System.out.println("Mr. Mulcahy doesn't recognize you, but you definitely need to get outta here before Mr. Ng comes here for you.");
                    System.out.println("a. to Mr. Ewing's room" + "\n" + "b. to INSO classroom");
                    if (userReturn.contains("a")) {
                        securityDanger = alterParameters(securityDanger, 15, true);
                        System.out.println("You run into Mr. Ewing's classroom. You plead him to help you..." + "\n" + "Mr. Ewing is nice enough to give you two items that might help you, which one do you want:" + printParameters(securityDanger));
                        System.out.println("a. computer with IntelliJ installed" + "\n" + "b. invisibility potion" + "\n" + "c. use neither");
                        userReturn = console.nextLine();
                        if (userReturn.contains("a")) { //dead
                            System.out.println("Great! With this computer, you can pretend to be a hardworking student grinding CS!");
                            skipForward();
                            System.out.println("Mr. Ng is approaching Mr. Ewing's classroom...");
                            skipForward();
                            System.out.println("You open up the computer...");
                            skipForward();
                            System.out.println("Oh god, Mr. Ewing has been playing DOTA 2 on it and forgot to close it. Mr. Ng walks past the classroom and sees you playing games.");
                            System.out.println("He bursts in!");
                            System.out.println(loseMessage);
                        } else if (userReturn.contains("b")) { // dead
                            System.out.println("AWESOME! Nobody can see you now!");
                            System.out.println("You slow dance past Mr. Ng, down the stairs, and out of the school gates");
                            skipForward();
                            System.out.println("Wow! You got out! But get hit by a mini bus because the driver couldn't see you");
                        } else { // live
                            securityDanger = alterParameters(securityDanger, 2, false);
                            if (atUnitsOrTens(securityDanger, 4, true)) {
                                System.out.println("Woah woah woah, I recognize your security alertness is now at" + printParameters(securityDanger) + ".");
                                skipForward();
                                System.out.println("It's the unlucky units number of this game.");
                                securityDanger = alterParameters(securityDanger, 4, true);
                                skipForward();
                                System.out.println("As a result, you are awarded 4% extra security alertness!" + printParameters(securityDanger));
                                System.out.println("let's keep going");
                                skipForward();
                            } else {
                                securityDanger += 0;
                            }
                            System.out.println("hmm, interesting choice of yours huh?");
                            System.out.println("Just after Mr. Ng passes the classroom, you burst and run downstairs");
                            skipForward();
                            System.out.println("Some film students are filming on the 4th floor. what do you wanna do: " + printParameters(securityDanger));
                            System.out.println("a. give them each 50 dollars and keep moving" + "\n" + "b. run through their set and keep moving" + "\n" + "c. pretend to be an actor in their team");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { // you keep moving without being added the 40
                                System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                                securityDanger = alterParameters(securityDanger, 40, true);
                                if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                                    if (securityDanger>=100 && randomLose()) {
                                        printSecLose();
                                    } else if (securityDanger>=100 && !randomLose()) {
                                        printSecLose();
                                    } else {
                                        printRandomLose();
                                    }
                                }  else {//starts to execute the next line in the 3rd floor bathroom
                                    System.out.println("You arrive on the third floor and slip into a bathroom.");
                                    skipForward();
                                    System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                                    System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                                    userReturn = console.nextLine();
                                    if (picksChoice(userReturn, "a")) { //right route, keep living
                                        System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                        skipForward();
                                        System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                        System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                        userReturn = console.nextLine();
                                        if (picksChoice(userReturn, "a")) {
                                            System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                            skipForward();
                                            System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                            skipForward();
                                            System.out.println("Mr. Ng ultimately breaks in");
                                            System.out.println(loseMessage);
                                        } else if (picksChoice(userReturn, "b")) {
                                            System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                            skipForward();
                                            System.out.println("to pick lock, press enter");
                                            skipForward();
                                            System.out.println("pick again (enter again obviously)");
                                            skipForward();
                                            System.out.println("How bout once more?");
                                            skipForward();
                                            System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                            System.out.println(loseMessage);
                                        } else {
                                            alterParameters(securityDanger, 10, true);
                                            if (testLose(securityDanger, randomLose())) {
                                                if (securityDanger>=100 && randomLose()) {
                                                    printSecLose();
                                                } else if (securityDanger>=100 && !randomLose()) {
                                                    printSecLose();
                                                } else {
                                                    printRandomLose();
                                                }
                                            } else {
                                                System.out.println("You grabbed the teacher's coat and school ID.");
                                                skipForward();
                                                System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                                skipForward();
                                                System.out.println("You exit the school without a single person stopping you");
                                                System.out.println(winMessage);
                                            }
                                        }
                                    } else if (picksChoice(userReturn, "b")) { //dead route
                                        System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                        skipForward();
                                        System.out.println("You feel a serge of power in your body.");
                                        skipForward();
                                        System.out.println("It has brought you so much strength!!!...");
                                        skipForward();
                                        System.out.println("to the point that you can't handle it. You get a heart attack and die");
                                    } else { // dead
                                        System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                        System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                        System.out.println(loseMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { // in this line, you can still live if the +40 security doesn't kill you
                                System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                                securityDanger = alterParameters(securityDanger, 40, true);
                                if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you & random death
                                    if (securityDanger>=100 && randomLose()) {
                                        printSecLose();
                                    } else if (securityDanger>=100 && !randomLose()) {
                                        printSecLose();
                                    } else {
                                        printRandomLose();
                                    }
                                }  else {//starts to execute the next line in the 3rd floor bathroom
                                    System.out.println("You arrive on the third floor and slip into a bathroom.");
                                    skipForward();
                                    System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                                    System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                                    userReturn = console.nextLine();
                                    if (picksChoice(userReturn, "a")) { //right route, keep living
                                        System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                        skipForward();
                                        System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                        System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                        userReturn = console.nextLine();
                                        if (picksChoice(userReturn, "a")) {
                                            System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                            skipForward();
                                            System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                            skipForward();
                                            System.out.println("Mr. Ng ultimately breaks in");
                                            System.out.println(loseMessage);
                                        } else if (picksChoice(userReturn, "b")) {
                                            System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                            skipForward();
                                            System.out.println("to pick lock, press enter");
                                            skipForward();
                                            System.out.println("pick again (enter again obviously)");
                                            skipForward();
                                            System.out.println("How bout once more?");
                                            skipForward();
                                            System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                            System.out.println(loseMessage);
                                        } else {
                                            alterParameters(securityDanger, 10, true);
                                            if (testLose(securityDanger, randomLose())) {
                                                if (securityDanger>=100 && randomLose()) {
                                                    printSecLose();
                                                } else if (securityDanger>=100 && !randomLose()) {
                                                    printSecLose();
                                                } else {
                                                    printRandomLose();
                                                }
                                            } else {
                                                System.out.println("You grabbed the teacher's coat and school ID.");
                                                skipForward();
                                                System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                                skipForward();
                                                System.out.println("You exit the school without a single person stopping you");
                                                System.out.println(winMessage);
                                            }
                                        }
                                    } else if (picksChoice(userReturn, "b")) { //dead route
                                        System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                        skipForward();
                                        System.out.println("You feel a serge of power in your body.");
                                        skipForward();
                                        System.out.println("It has brought you so much strength!!!...");
                                        skipForward();
                                        System.out.println("to the point that you can't handle it. You get a heart attack and die");
                                    } else { // dead
                                        System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                        System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                        System.out.println(loseMessage);
                                    }
                                }
                            } else {
                                System.out.println("You take the main character's role");
                                skipForward();
                                System.out.println("However, you're acting was too bad that Mr. Ng spotted you instantly as he walks to the 4th floor");
                                System.out.println(loseMessage);
                            }
                        }
                    } else { //goes to inso after leaving bathroom
                        System.out.println("You walk into a Y11 INSO classroom. You take a seat, pretending to be a student that arrived to class just a bit too early");
                        skipForward();
                        System.out.println("You wait and wait...");
                        skipForward();
                        System.out.println("and wait and wait...");
                        skipForward();
                        System.out.println("Break is over! And INSO students come walking into the classroom. The teacher starts the lesson");
                        System.out.println("You die of boredom from INSO :)");
                    }
                } else {
                    System.out.println("Mr. Mulcahy has heard from Mr. Ng's text that you are on the run, and you run right into him");
                    System.out.println(loseMessage);
                }
            } else if (userReturn.contains("b")) { // if b, you go into ewing class this is the EWING BRANCH
                securityDanger = alterParameters(securityDanger, 15, true);
                System.out.println("You run into Mr. Ewing's classroom. You plead him to help you..." + "\n" + "Mr. Ewing is nice enough to give you two items that might help you, which one do you want:" + printParameters(securityDanger));
                System.out.println("a. computer with IntelliJ installed" + "\n" + "b. invisibility potion" + "\n" + "c. use neither");
                userReturn = console.nextLine();
                if (userReturn.contains("a")) { //dead
                    System.out.println("Great! With this computer, you can pretend to be a hardworking student grinding CS!");
                    skipForward();
                    System.out.println("Mr. Ng is approaching Mr. Ewing's classroom...");
                    skipForward();
                    System.out.println("You open up the computer...");
                    skipForward();
                    System.out.println("Oh god, Mr. Ewing has been playing DOTA 2 on it and forgot to close it. Mr. Ng walks past the classroom and sees you playing games.");
                    System.out.println("He bursts in!");
                    System.out.println(loseMessage);
                } else if (userReturn.contains("b")) { // dead
                    System.out.println("AWESOME! Nobody can see you now!");
                    System.out.println("You slow dance past Mr. Ng, down the stairs, and out of the school gates");
                    skipForward();
                    System.out.println("Wow! You got out! But get hit by a mini bus because the driver couldn't see you");
                } else { // live
                    securityDanger = alterParameters(securityDanger, 2, false);
                    if (atUnitsOrTens(securityDanger, 4, true)) {
                        System.out.println("Woah woah woah, I recognize your security alertness is now at" + printParameters(securityDanger) + ".");
                        skipForward();
                        System.out.println("It's the unlucky units number of this game.");
                        securityDanger = alterParameters(securityDanger, 4, true);
                        skipForward();
                        System.out.println("As a result, you are awarded 4% extra security alertness!" + printParameters(securityDanger));
                        System.out.println("let's keep going");
                        skipForward();
                    } else {
                        securityDanger += 0;
                    }
                    System.out.println("hmm, interesting choice of yours huh?");
                    System.out.println("Just after Mr. Ng passes the classroom, you burst and run downstairs");
                    skipForward();
                    System.out.println("Some film students are filming on the 4th floor. what do you wanna do: " + printParameters(securityDanger));
                    System.out.println("a. give them each 50 dollars and keep moving" + "\n" + "b. run through their set and keep moving" + "\n" + "c. pretend to be an actor in their team");
                    userReturn = console.nextLine();
                    if (picksChoice(userReturn, "a")) { // you keep moving without being added the 40
                        System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                        if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                            if (securityDanger>=100 && randomLose()) {
                                printSecLose();
                            } else if (securityDanger>=100 && !randomLose()) {
                                printSecLose();
                            } else {
                                printRandomLose();
                            }
                        }  else {//starts to execute the next line in the 3rd floor bathroom
                            System.out.println("You arrive on the third floor and slip into a bathroom.");
                            skipForward();
                            System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                            System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { //right route, keep living
                                System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                skipForward();
                                System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                userReturn = console.next();
                                if (picksChoice(userReturn, "a")) {
                                    System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                    skipForward();
                                    System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                    skipForward();
                                    System.out.println("Mr. Ng ultimately breaks in");
                                    System.out.println(loseMessage);
                                } else if (picksChoice(userReturn, "b")) {
                                    System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                    skipForward();
                                    System.out.println("to pick lock, press enter");
                                    skipForward();
                                    System.out.println("pick again (enter again obviously)");
                                    skipForward();
                                    System.out.println("How bout once more?");
                                    skipForward();
                                    System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                    System.out.println(loseMessage);
                                } else {
                                    alterParameters(securityDanger, 10, true);
                                    if (testLose(securityDanger, randomLose())) {
                                        if (securityDanger>=100 && randomLose()) {
                                            printSecLose();
                                        } else if (securityDanger>=100 && !randomLose()) {
                                            printSecLose();
                                        } else {
                                            printRandomLose();
                                        }
                                    } else {
                                        System.out.println("You grabbed the teacher's coat and school ID.");
                                        skipForward();
                                        System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                        skipForward();
                                        System.out.println("You exit the school without a single person stopping you");
                                        System.out.println(winMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { //dead route
                                System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                skipForward();
                                System.out.println("You feel a serge of power in your body.");
                                skipForward();
                                System.out.println("It has brought you so much strength!!!...");
                                skipForward();
                                System.out.println("to the point that you can't handle it. You get a heart attack and die");
                            } else { // dead
                                System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                System.out.println(loseMessage);
                            }
                        }
                    } else if (picksChoice(userReturn, "b")) { // in this line, you can still live if the +40 security doesn't kill you
                        System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                        securityDanger = alterParameters(securityDanger, 40, true);
                        if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                            if (securityDanger>=100 && randomLose()) {
                                printSecLose();
                            } else if (securityDanger>=100 && !randomLose()) {
                                printSecLose();
                            } else {
                                printRandomLose();
                            }
                        }  else {//starts to execute the next line in the 3rd floor bathroom
                            System.out.println("You arrive on the third floor and slip into a bathroom.");
                            skipForward();
                            System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                            System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { //right route, keep living
                                System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                skipForward();
                                System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                userReturn = console.nextLine();
                                if (picksChoice(userReturn, "a")) {
                                    System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                    skipForward();
                                    System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                    skipForward();
                                    System.out.println("Mr. Ng ultimately breaks in");
                                    System.out.println(loseMessage);
                                } else if (picksChoice(userReturn, "b")) {
                                    System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                    skipForward();
                                    System.out.println("to pick lock, press enter");
                                    skipForward();
                                    System.out.println("pick again (enter again obviously)");
                                    skipForward();
                                    System.out.println("How bout once more?");
                                    skipForward();
                                    System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                    System.out.println(loseMessage);
                                } else {
                                    alterParameters(securityDanger, 10, true);
                                    if (testLose(securityDanger, randomLose())) {
                                        if (securityDanger>=100 && randomLose()) {
                                            printSecLose();
                                        } else if (securityDanger>=100 && !randomLose()) {
                                            printSecLose();
                                        } else {
                                            printRandomLose();
                                        }
                                    } else {
                                        System.out.println("You grabbed the teacher's coat and school ID.");
                                        skipForward();
                                        System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                        skipForward();
                                        System.out.println("You exit the school without a single person stopping you");
                                        System.out.println(winMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { //dead route
                                System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                skipForward();
                                System.out.println("You feel a serge of power in your body.");
                                skipForward();
                                System.out.println("It has brought you so much strength!!!...");
                                skipForward();
                                System.out.println("to the point that you can't handle it. You get a heart attack and die");
                            } else { // dead
                                System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                System.out.println(loseMessage);
                            }
                        }
                    } else {
                        System.out.println("You take the main character's role");
                        skipForward();
                        System.out.println("However, you're acting was too bad that Mr. Ng spotted you instantly as he walks to the 4th floor");
                        System.out.println(loseMessage);
                    }
                }
            } else { // if c, into INSO classroom
                System.out.println("You walk into a Y11 INSO classroom. You take a seat, pretending to be a student that arrived to class just a bit too early");
                skipForward();
                System.out.println("You wait and wait...");
                skipForward();
                System.out.println("and wait and wait...");
                skipForward();
                System.out.println("Break is over! And INSO students come walking into the classroom. The teacher starts the lesson");
                System.out.println("You die of boredom from INSO :)");
            }
        } else { // come back at the very end to paste the whole subsequent process into this statement
            securityDanger = alterParameters(securityDanger, random67(), true);
            System.out.println("You arrive on the 5th floor, where do you wanna go now:" + printParameters(securityDanger) + "\n" + "a. into a bathroom" + "\n" + "b. to Mr. Ewing's room" + "\n" + "c. to INSO classroom");
            userReturn = console.nextLine();
            if (userReturn.contains("a")) { // if a, into a bathrooom
                System.out.println("You run into the bathroom and close the door. However, there are multiple students being lectured by Mr. Mulcahy for using there phones in the bathroom.");
                if (!securityAtAbove(securityDanger, 25)) {
                    System.out.println("Mr. Mulcahy doesn't recognize you, but you definitely need to get outta here before Mr. Ng comes here for you.");
                    System.out.println("a. to Mr. Ewing's room" + "\n" + "b. to INSO classroom");
                    userReturn = console.nextLine();
                    if (userReturn.contains("a")) {
                        securityDanger = alterParameters(securityDanger, 15, true);
                        System.out.println("You run into Mr. Ewing's classroom. You plead him to help you..." + "\n" + "Mr. Ewing is nice enough to give you two items that might help you, which one do you want:" + printParameters(securityDanger));
                        System.out.println("a. computer with IntelliJ installed" + "\n" + "b. invisibility potion" + "\n" + "c. use neither");
                        userReturn = console.nextLine();
                        if (userReturn.contains("a")) { //dead
                            System.out.println("Great! With this computer, you can pretend to be a hardworking student grinding CS!");
                            skipForward();
                            System.out.println("Mr. Ng is approaching Mr. Ewing's classroom...");
                            skipForward();
                            System.out.println("You open up the computer...");
                            skipForward();
                            System.out.println("Oh god, Mr. Ewing has been playing DOTA 2 on it and forgot to close it. Mr. Ng walks past the classroom and sees you playing games.");
                            System.out.println("He bursts in!");
                            System.out.println(loseMessage);
                        } else if (userReturn.contains("b")) { // dead
                            System.out.println("AWESOME! Nobody can see you now!");
                            System.out.println("You slow dance past Mr. Ng, down the stairs, and out of the school gates");
                            skipForward();
                            System.out.println("Wow! You got out! But get hit by a mini bus because the driver couldn't see you");
                        } else { // live
                            securityDanger = alterParameters(securityDanger, 2, false);
                            if (atUnitsOrTens(securityDanger, 4, true)) {
                                System.out.println("Woah woah woah, I recognize your security alertness is now at" + printParameters(securityDanger) + ".");
                                skipForward();
                                System.out.println("It's the unlucky units number of this game.");
                                securityDanger = alterParameters(securityDanger, 4, true);
                                skipForward();
                                System.out.println("As a result, you are awarded 4% extra security alertness!" + printParameters(securityDanger));
                                System.out.println("let's keep going");
                                skipForward();
                            } else {
                                securityDanger += 0;
                            }
                            System.out.println("hmm, interesting choice of yours huh?");
                            System.out.println("Just after Mr. Ng passes the classroom, you burst and run downstairs");
                            skipForward();
                            System.out.println("Some film students are filming on the 4th floor. what do you wanna do: " + printParameters(securityDanger));
                            System.out.println("a. give them each 50 dollars and keep moving" + "\n" + "b. run through their set and keep moving" + "\n" + "c. pretend to be an actor in their team");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { // you keep moving without being added the 40
                                System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                                securityDanger = alterParameters(securityDanger, 40, true);
                                if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                                    if (securityDanger>=100 && randomLose()) {
                                        printSecLose();
                                    } else if (securityDanger>=100 && !randomLose()) {
                                        printSecLose();
                                    } else {
                                        printRandomLose();
                                    }
                                }  else {//starts to execute the next line in the 3rd floor bathroom
                                    System.out.println("You arrive on the third floor and slip into a bathroom.");
                                    skipForward();
                                    System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                                    System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                                    userReturn = console.nextLine();
                                    if (picksChoice(userReturn, "a")) { //right route, keep living
                                        System.out.println("You drill downwards, and you land in the teachers' changing room, no one is in there");
                                        skipForward();
                                        System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                        System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                        userReturn = console.nextLine();
                                        if (picksChoice(userReturn, "a")) {
                                            System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                            skipForward();
                                            System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                            skipForward();
                                            System.out.println("Mr. Ng ultimately breaks in");
                                            System.out.println(loseMessage);
                                        } else if (picksChoice(userReturn, "b")) {
                                            System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                            skipForward();
                                            System.out.println("to pick lock, press enter");
                                            skipForward();
                                            System.out.println("pick again (enter again obviously)");
                                            skipForward();
                                            System.out.println("How bout once more?");
                                            skipForward();
                                            System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                            System.out.println(loseMessage);
                                        } else {
                                            alterParameters(securityDanger, 10, true);
                                            if (testLose(securityDanger, randomLose())) {
                                                if (securityDanger>=100 && randomLose()) {
                                                    printSecLose();
                                                } else if (securityDanger>=100 && !randomLose()) {
                                                    printSecLose();
                                                } else {
                                                    printRandomLose();
                                                }
                                            } else {
                                                System.out.println("You grabbed the teacher's coat and school ID.");
                                                skipForward();
                                                System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                                skipForward();
                                                System.out.println("You exit the school without a single person stopping you");
                                                System.out.println(winMessage);
                                            }
                                        }
                                    } else if (picksChoice(userReturn, "b")) { //dead route
                                        System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                        skipForward();
                                        System.out.println("You feel a serge of power in your body.");
                                        skipForward();
                                        System.out.println("It has brought you so much strength!!!...");
                                        skipForward();
                                        System.out.println("to the point that you can't handle it. You get a heart attack and die");
                                    } else { // dead
                                        System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                        System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                        System.out.println(loseMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { // in this line, you can still live if the +40 security doesn't kill you
                                System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                                securityDanger = alterParameters(securityDanger, 40, true);
                                if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                                    if (securityDanger>=100 && randomLose()) {
                                        printSecLose();
                                    } else if (securityDanger>=100 && !randomLose()) {
                                        printSecLose();
                                    } else {
                                        printRandomLose();
                                    }
                                }  else {//starts to execute the next line in the 3rd floor bathroom
                                    System.out.println("You arrive on the third floor and slip into a bathroom.");
                                    skipForward();
                                    System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                                    System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                                    userReturn = console.nextLine();
                                    if (picksChoice(userReturn, "a")) { //right route, keep living
                                        System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                        skipForward();
                                        System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                        System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                        userReturn = console.nextLine();
                                        if (picksChoice(userReturn, "a")) {
                                            System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                            skipForward();
                                            System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                            skipForward();
                                            System.out.println("Mr. Ng ultimately breaks in");
                                            System.out.println(loseMessage);
                                        } else if (picksChoice(userReturn, "b")) {
                                            System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                            skipForward();
                                            System.out.println("to pick lock, press enter");
                                            skipForward();
                                            System.out.println("pick again (enter again obviously)");
                                            skipForward();
                                            System.out.println("How bout once more?");
                                            skipForward();
                                            System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                            System.out.println(loseMessage);
                                        } else {
                                            alterParameters(securityDanger, 10, true);
                                            if (testLose(securityDanger, randomLose())) {
                                                if (securityDanger>=100 && randomLose()) {
                                                    printSecLose();
                                                } else if (securityDanger>=100 && !randomLose()) {
                                                    printSecLose();
                                                } else {
                                                    printRandomLose();
                                                }
                                            } else {
                                                System.out.println("You grabbed the teacher's coat and school ID.");
                                                skipForward();
                                                System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                                skipForward();
                                                System.out.println("You exit the school without a single person stopping you");
                                                System.out.println(winMessage);
                                            }
                                        }
                                    } else if (picksChoice(userReturn, "b")) { //dead route
                                        System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                        skipForward();
                                        System.out.println("You feel a serge of power in your body.");
                                        skipForward();
                                        System.out.println("It has brought you so much strength!!!...");
                                        skipForward();
                                        System.out.println("to the point that you can't handle it. You get a heart attack and die");
                                    } else { // dead
                                        System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                        System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                        System.out.println(loseMessage);
                                    }
                                }
                            } else {
                                System.out.println("You take the main character's role");
                                skipForward();
                                System.out.println("However, you're acting was too bad that Mr. Ng spotted you instantly as he walks to the 4th floor");
                                System.out.println(loseMessage);
                            }
                        }
                    } else { //goes to inso after leaving bathroom
                        System.out.println("You walk into a Y11 INSO classroom. You take a seat, pretending to be a student that arrived to class just a bit too early");
                        skipForward();
                        System.out.println("You wait and wait...");
                        skipForward();
                        System.out.println("and wait and wait...");
                        skipForward();
                        System.out.println("Break is over! And INSO students come walking into the classroom. The teacher starts the lesson");
                        System.out.println("You die of boredom from INSO :)");
                    }
                } else {
                    System.out.println("Mr. Mulcahy has heard from Mr. Ng's text that you are on the run, and you run right into him");
                    System.out.println(loseMessage);
                }
            } else if (userReturn.contains("b")) { // if b, you go into ewing class this is the EWING BRANCH
                securityDanger = alterParameters(securityDanger, 15, true);
                System.out.println("You run into Mr. Ewing's classroom. You plead him to help you..." + "\n" + "Mr. Ewing is nice enough to give you two items that might help you, which one do you want:" + printParameters(securityDanger));
                System.out.println("a. computer with IntelliJ installed" + "\n" + "b. invisibility potion" + "\n" + "c. use neither");
                userReturn = console.nextLine();
                if (userReturn.contains("a")) { //dead
                    System.out.println("Great! With this computer, you can pretend to be a hardworking student grinding CS!");
                    skipForward();
                    System.out.println("Mr. Ng is approaching Mr. Ewing's classroom...");
                    skipForward();
                    System.out.println("You open up the computer...");
                    skipForward();
                    System.out.println("Oh god, Mr. Ewing has been playing DOTA 2 on it and forgot to close it. Mr. Ng walks past the classroom and sees you playing games.");
                    System.out.println("He bursts in!");
                    System.out.println(loseMessage);
                } else if (userReturn.contains("b")) { // dead
                    System.out.println("AWESOME! Nobody can see you now!");
                    System.out.println("You slow dance past Mr. Ng, down the stairs, and out of the school gates");
                    skipForward();
                    System.out.println("Wow! You got out! But get hit by a mini bus because the driver couldn't see you");
                } else { // live
                    securityDanger = alterParameters(securityDanger, 2, false);
                    if (atUnitsOrTens(securityDanger, 4, true)) {
                        System.out.println("Woah woah woah, I recognize your security alertness is now at" + printParameters(securityDanger) + ".");
                        skipForward();
                        System.out.println("It's the unlucky units number of this game.");
                        securityDanger = alterParameters(securityDanger, 4, true);
                        skipForward();
                        System.out.println("As a result, you are awarded 4% extra security alertness!" + printParameters(securityDanger));
                        System.out.println("let's keep going");
                        skipForward();
                    } else {
                        securityDanger += 0;
                    }
                    System.out.println("hmm, interesting choice of yours huh?");
                    System.out.println("Just after Mr. Ng passes the classroom, you burst and run downstairs");
                    skipForward();
                    System.out.println("Some film students are filming on the 4th floor. what do you wanna do: " + printParameters(securityDanger));
                    System.out.println("a. give them each 50 dollars and keep moving" + "\n" + "b. run through their set and keep moving" + "\n" + "c. pretend to be an actor in their team");
                    userReturn = console.nextLine();
                    if (picksChoice(userReturn, "a")) { // you keep moving without being added the 40
                        System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                        if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                            if (securityDanger>=100 && randomLose()) {
                                printSecLose();
                            } else if (securityDanger>=100 && !randomLose()) {
                                printSecLose();
                            } else {
                                printRandomLose();
                            }
                        }  else {//starts to execute the next line in the 3rd floor bathroom
                            System.out.println("You arrive on the third floor and slip into a bathroom.");
                            skipForward();
                            System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                            System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { //right route, keep living
                                System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                skipForward();
                                System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                userReturn = console.nextLine();
                                if (picksChoice(userReturn, "a")) {
                                    System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                    skipForward();
                                    System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                    skipForward();
                                    System.out.println("Mr. Ng ultimately breaks in");
                                    System.out.println(loseMessage);
                                } else if (picksChoice(userReturn, "b")) {
                                    System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                    skipForward();
                                    System.out.println("to pick lock, press enter");
                                    skipForward();
                                    System.out.println("pick again (enter again obviously)");
                                    skipForward();
                                    System.out.println("How bout once more?");
                                    skipForward();
                                    System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                    System.out.println(loseMessage);
                                } else {
                                    alterParameters(securityDanger, 10, true);
                                    if (testLose(securityDanger, randomLose())) {
                                        if (securityDanger>=100 && randomLose()) {
                                            printSecLose();
                                        } else if (securityDanger>=100 && !randomLose()) {
                                            printSecLose();
                                        } else {
                                            printRandomLose();
                                        }
                                    } else {
                                        System.out.println("You grabbed the teacher's coat and school ID.");
                                        skipForward();
                                        System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                        skipForward();
                                        System.out.println("You exit the school without a single person stopping you");
                                        System.out.println(winMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { //dead route
                                System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                skipForward();
                                System.out.println("You feel a serge of power in your body.");
                                skipForward();
                                System.out.println("It has brought you so much strength!!!...");
                                skipForward();
                                System.out.println("to the point that you can't handle it. You get a heart attack and die");
                            } else { // dead
                                System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                System.out.println(loseMessage);
                            }
                        }
                    } else if (picksChoice(userReturn, "b")) { // in this line, you can still live if the +40 security doesn't kill you
                        System.out.println("You keep going, but these students are mad that you interrupted them and have alerted security!");
                        securityDanger = alterParameters(securityDanger, 40, true);
                        if (testLose(securityDanger, randomLose())) { // to see if the +40 kills you
                            if (securityDanger>=100 && randomLose()) {
                                printSecLose();
                            } else if (securityDanger>=100 && !randomLose()) {
                                printSecLose();
                            } else {
                                printRandomLose();
                            }
                        }  else {//starts to execute the next line in the 3rd floor bathroom
                            System.out.println("You arrive on the third floor and slip into a bathroom.");
                            skipForward();
                            System.out.println("Inside the bin, you see three things. What are gonna use: " + printParameters(securityDanger));
                            System.out.println("a. drill" + "\n" + "b. weird looking gatorade" + "\n" + "c. jetpack");
                            userReturn = console.nextLine();
                            if (picksChoice(userReturn, "a")) { //right route, keep living
                                System.out.println("You drill downwards, and you land in the male teachers' changing room");
                                skipForward();
                                System.out.println("You go through the teachers' properties, and you take: " + printParameters(securityDanger));
                                System.out.println("a. belt" + "\n" + "b. lock picker" + "\n" + "c. suit and ID card");
                                userReturn = console.nextLine();
                                if (picksChoice(userReturn, "a")) {
                                    System.out.println("You try to lock the door by tying the belt on it. This will buy you time to escape from within the changing room.");
                                    skipForward();
                                    System.out.println("Ok I mean... what were you expecting you could do with a belt.");
                                    skipForward();
                                    System.out.println("Mr. Ng ultimately breaks in");
                                    System.out.println(loseMessage);
                                } else if (picksChoice(userReturn, "b")) {
                                    System.out.println("You try to pick the lock on a small door that leads to the outside.");
                                    skipForward();
                                    System.out.println("to pick lock, press enter");
                                    skipForward();
                                    System.out.println("pick again (enter again obviously)");
                                    skipForward();
                                    System.out.println("How bout once more?");
                                    skipForward();
                                    System.out.println("You're finally out! You've just run into a few security guards on their shift...");
                                    System.out.println(loseMessage);
                                } else {
                                    alterParameters(securityDanger, 10, true);
                                    if (testLose(securityDanger, randomLose())) {
                                        if (securityDanger>=100 && randomLose()) {
                                            printSecLose();
                                        } else if (securityDanger>=100 && !randomLose()) {
                                            printSecLose();
                                        } else {
                                            printRandomLose();
                                        }
                                    } else {
                                        System.out.println("You grabbed the teacher's coat and school ID.");
                                        skipForward();
                                        System.out.println("You walked confidently out of the changing room, said hello to Mr. Ng who just happened to miss his target");
                                        skipForward();
                                        System.out.println("You exit the school without a single person stopping you");
                                        System.out.println(winMessage);
                                    }
                                }
                            } else if (picksChoice(userReturn, "b")) { //dead route
                                System.out.println("You drink all the gatorade and gobble up the bottle too.");
                                skipForward();
                                System.out.println("You feel a serge of power in your body.");
                                skipForward();
                                System.out.println("It has brought you so much strength!!!...");
                                skipForward();
                                System.out.println("to the point that you can't handle it. You get a heart attack and die");
                            } else { // dead
                                System.out.println("You put on the jetpack, start the engine, and we are off for a little flight");
                                skipForward();
                                System.out.println("Unfortunately, you don't really know how to operate the jetpack. You land head first in front of Mr. Ng...");
                                System.out.println(loseMessage);
                            }
                        }
                    } else {
                        System.out.println("You take the main character's role");
                        skipForward();
                        System.out.println("However, you're acting was too bad that Mr. Ng spotted you instantly as he walks to the 4th floor");
                        System.out.println(loseMessage);
                    }
                }
            } else { // if c, into INSO classroom
                System.out.println("You walk into a Y11 INSO classroom. You take a seat, pretending to be a student that arrived to class just a bit too early");
                skipForward();
                System.out.println("You wait and wait...");
                skipForward();
                System.out.println("and wait and wait...");
                skipForward();
                System.out.println("Break is over! And INSO students come walking into the classroom. The teacher starts the lesson");
                System.out.println("You die of boredom from INSO :)");
            }
        }
    }
    public static void skipForward() {
        Scanner console = new Scanner(System.in);
        console.nextLine();
    }
    public static boolean picksChoice(String str, String letter) {
        return str.contains(letter);
    }
    public static boolean securityAtAbove(int level, int limit) {
        return level >= limit;
    }
    public static boolean atUnitsOrTens(int level, int goal, boolean findUnits) {
        if (findUnits) {
            return level % 10 == goal;
        } else {
            double midTransform = level / 10;
            int afterTransform = (int) midTransform;
            return afterTransform == goal;
        }
    }
    public static int random67() {
        double rand = Math.random() + 7;
        return (int) (rand - 0.5);
    }

    public static boolean randomLose() {
        double rand1 = Math.random();
        double rand2 = Math.random();
        return (rand1 <= 0.2 && rand1 >= 0.0) && (rand2 <= 0.9 && rand2 >= 0.3);
    }
    public static boolean testLose(int secDanger, boolean randomLose) {
        if (randomLose) {
            return true;
        } else if (secDanger >= 100) {
            return true;
        } else {
            return false;
        }
    }
    public static String printParameters(int secDanger) {
        return "(security = " + secDanger + "%" + ")";
    }
    public static int alterParameters(int sec, int factor, boolean add) {
        if (add) {
            return sec += factor;
        } else {
            return sec *= factor;
        }
    }
    public static void printRandomLose() {
        System.out.println("Well you see... sometimes people just have very bad luck." + "\n" + "You trip on a random tiny stone/pebble on the ground, and Mr. Ng caught up to you." + "\n" + "Just try again, I'm sure the same thing wouldn't happen twice :)");
    }
    public static void printSecLose() {
        System.out.println("Guess you were too slow! Security guards have all arrived. They controlled you on the ground" + "\n" + "Should start considering HKIS applications!");
    }
}
/*
ESCAPE MR.NG'S DETENTION!!
Storyline:
You are a Y11 student at CIS. You pulled out your phone in the hallway, just to check the time. However, Mr. Ng walked pass at the exact moment
You got CAUGHT. He's about to confiscate your phone right on the spot, and send you to detention immediately. You run. Get outta here. That's all you gotta do.
Fucntions in this game: multiple choice, there is only one right way to get out (a sequence of right decisions).
a narrator is going to "help" you get out and give you "useful" hints.
If possible, I might make the narrator troll the player sometimes just to annoy them.
Win condition: don't get caught, either by Mr. Ng himself, security, or other teachers.
- if
*/