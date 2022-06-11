import java.util.Scanner;
public class Halloween_ex {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        boolean userStillPlaying = true;
        while (userStillPlaying) {
            System.out.println("Welcome to the Zombie House! " +
                    "You must make life or death decisions in order to escape. " +
                    "If you make a decision that ends in death you will have to restart.");
            System.out.println("You are in the first room. There are 2 zombies. Would you like to run or hide?");
            String userDecision = scanner.nextLine();
            while (!userDecision.equals("run") && !userDecision.equals("hide")) {
                System.out.println("Enter a valid choice!");
                userDecision = scanner.nextLine();
            }
            if (userDecision.equals("run")) {
                System.out.println("The zombie caught you, and you died. You must restart.");
            } else {
                System.out.println("The zombies couldn't find you and left. " +
                        "You have successfully moved onto the second room. " +
                        "There is one zombie in this room. Would you like to run or fight?");
                userDecision = scanner.nextLine();
                {
                    while (!userDecision.equals("run") && !userDecision.equals("fight")) {
                        System.out.println("Enter a valid choice!");
                        userDecision = scanner.nextLine();
                    }
                    if (userDecision.equals("run")) {
                        System.out.println("The zombies caught you, and you died. You must restart.");
                    } else {
                        if (userDecision.equals("fight")) {
                            System.out.println("You beat the zombies and moved to the third room! " +
                                    "There are five zombies in this room. Would you like to distract or fight the zombies?");
                            userDecision = scanner.nextLine();
                            {
                                while (!userDecision.equals("distract") && !userDecision.equals("fight")) {
                                    System.out.println("Enter a valid choice");
                                    userDecision = scanner.nextLine();
                                }
                                if (userDecision.equals("fight")) {
                                    System.out.println("The zombies beat you. You must restart");
                                } else {
                                    if (userDecision.equals("distract")) {
                                        System.out.println("You beat the zombies and moved to the fourth room! There is one zombie in this room would you like to" +
                                                " to use your stun gun or hide");
                                        userDecision = scanner.nextLine();
                                        {
                                            while (!userDecision.equals("use stun gun") && !userDecision.equals("hide")) {
                                                System.out.println("Enter a valid choice!");
                                                userDecision = scanner.nextLine();
                                            }
                                            if (userDecision.equals("hide")) {
                                                System.out.println("The zombie found you. You must restart");
                                            } else {
                                                if (userDecision.equals("use stun gun")) {
                                                    System.out.println("You were able to make it to the fifth room! There are eight zombies in this room. Would you like to" +
                                                            " run or create a trap");
                                                    userDecision = scanner.nextLine();
                                                    {
                                                        while (!userDecision.equals("run") && !userDecision.equals("create a trap")) {
                                                            System.out.println("Enter a valid choice!");
                                                            userDecision = scanner.nextLine();
                                                        }
                                                        if (userDecision.equals("create a trap")) {
                                                            System.out.println("You did not create a trap quickly enough. You must restart.");
                                                        } else {
                                                            if (userDecision.equals("run")) {
                                                                System.out.println("You were able to out run eight zombies! Good work! You have made it to the sixth room. There are three zombies in this room. Would you like" +
                                                                        " to fight or distract");
                                                                userDecision = scanner.nextLine();
                                                                {
                                                                    while (!userDecision.equals("fight") && !userDecision.equals("distract")) {
                                                                        System.out.println("Enter a valid choice!");
                                                                        userDecision = scanner.nextLine();
                                                                    }
                                                                    if (userDecision.equals("distract")) {
                                                                        System.out.println("You were not successful and must restart.");
                                                                    } else {
                                                                        if (userDecision.equals("fight")) {
                                                                            System.out.println("You were able to fight off the zombie and have successfully made it to the seventh room." + "You walk in front of spiral stairs. Do you go left or right?");
                                                                            userDecision = scanner.nextLine();
                                                                            {
                                                                                while (!userDecision.equals("left") && !userDecision.equals("right")) {
                                                                                    System.out.println("Enter a valid choice!");
                                                                                    userDecision = scanner.nextLine();
                                                                                }
                                                                                if (userDecision.equals("left")) {
                                                                                    System.out.println("You trip and fall causing you to break your neck and die. You must restart.");
                                                                                } else {
                                                                                    if (userDecision.equals("right")) {
                                                                                        System.out.println("On the way of going down the right stair case you find ammo " + "You decide to keep going but where, left or right?");
                                                                                        userDecision = scanner.nextLine();
                                                                                        {
                                                                                            while (!userDecision.equals("left") && !userDecision.equals("right")) {
                                                                                                System.out.println("Enter a valid choice!");
                                                                                                userDecision = scanner.nextLine();
                                                                                            }
                                                                                            if (userDecision.equals("right")) {
                                                                                                System.out.println("There was a broken hole on the ground and you fell to your death. You must restart.");
                                                                                            } else {
                                                                                                if (userDecision.equals("left")) {
                                                                                                    System.out.println("Good decision! you went down the hall and found a flashlight!" + " The hallway is getting dark luckily you have your flash light"+"You find a basement do you enter it or go straight");
                                                                                                    userDecision = scanner.nextLine();
                                                                                                    {
                                                                                                        while (!userDecision.equals("enter") && !userDecision.equals("straight")) {
                                                                                                            System.out.println("Enter a valid choice!");
                                                                                                            userDecision = scanner.nextLine();
                                                                                                        }
                                                                                                        if (userDecision.equals("straight")) {
                                                                                                            System.out.println("You ran over a bunch of broken glass causing you to bleed to death. You must restart.");
                                                                                                        } else {
                                                                                                            if (userDecision.equals("enter")) {
                                                                                                                System.out.println("OH NO! ZOMBIES! You use the ammo you found and shoot them with your stun gun"+"You flashlight runs out of batteries but you see light ahead"+"Do you sit to regain energy or run to the light?");
                                                                                                                userDecision = scanner.nextLine();
                                                                                                                {
                                                                                                                                while (!userDecision.equals("sit") && !userDecision.equals("run")) {
                                                                                                                                    System.out.println("Enter a valid choice!");
                                                                                                                                    userDecision = scanner.nextLine();
                                                                                                                                }
                                                                                                                                if (userDecision.equals("sit")) {
                                                                                                                                    System.out.println("While sitting a zombie sneaks up to you and eats you to death. You must restart.");
                                                                                                                                } else {
                                                                                                                                    if (userDecision.equals("run")) {
                                                                                                                                        System.out.println("You see the way out but there is a explosive zombie. " + "Do you run around it or hide behind the wall");
                                                                                                                                        userDecision = scanner.nextLine();
                                                                                                                                        {
                                                                                                                                            while (!userDecision.equals("run") && !userDecision.equals("hide")) {
                                                                                                                                                System.out.println("Enter a valid choice!");
                                                                                                                                                userDecision = scanner.nextLine();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (userDecision.equals("run")) {
                                                                                                                                            System.out.println("The zombie exploded you, and you died. You must restart.");
                                                                                                                                        } else {
                                                                                                                                            System.out.println("The zombie exploded on its own letting you run away " + "You've exited the house! Congrats you won!");
                                                                                                                                            userStillPlaying = false;

                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }

                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
