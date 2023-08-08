import java.util.Scanner;

public class Assignment3 {

  public static void main(String[] args) {
    String blueBoldColor = "\033[034;1m";
    String greenColor = "\33[032;1m";
    String redColor = "\033[031m";
    String redBoldColor = "\033[031;1m";
    String resetBoldColor = "\033[;0m";
    String resetColor = "\033[0m";
    String blueColor = "\033[034m";
    String yellowColor = "\033[033;1m";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    name = name.strip();
    if (name.length() > 0) {
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();

      if (age < 10 | age > 18) {
        System.out.printf("%sInvalid Age%s \n", redColor, resetColor);
        return;
      } else {
        scanner.nextLine();
        System.out.print("Enter your subject1: ");
        String subject1 = scanner.nextLine();
        if (subject1.startsWith("SE")) {
          System.out.print("Enter your marks1: ");
          double marks1 = scanner.nextDouble();
          scanner.nextLine();
          if (marks1 > 100 && marks1 < 0) {
            System.out.printf("%sInvalid Marks%s", redColor, resetColor);
            return;
          } else {
            System.out.print("Enter your subject2: ");
            String subject2 = scanner.nextLine();
            if (subject1.equals(subject2)) {
              System.out.printf(
                "%sSubject already exists%s\n",
                redColor,
                resetColor
              );
              return;
            } else if (
              subject2.startsWith("SE") && !(subject1.equals(subject2))
            ) {
              System.out.print("Enter your marks2: ");
              double marks2 = scanner.nextDouble();
              scanner.nextLine();
              if (marks2 > 100 && marks2 < 0) {
                System.out.printf("%sInvalid Marks%s", redColor, resetColor);
                return;
              } else {
                System.out.print("Enter your subject3: ");
                String subject3 = scanner.nextLine();

                if (subject1.equals(subject3) || subject2.equals(subject3)) {
                  System.out.printf(
                    "%sSubject already exists%s\n",
                    redColor,
                    resetColor
                  );
                  return;
                } else if (
                  subject3.startsWith("SE") &&
                  !(subject1.equals(subject3) || subject2.equals(subject3))
                ) {
                  System.out.print("Enter your marks3: ");
                  double marks3 = scanner.nextDouble();
                  scanner.nextLine();
                  if (marks2 > 100 && marks2 < 0) {
                    System.out.printf(
                      "%sInvalid Marks%s\n",
                      redColor,
                      resetColor
                    );
                    return;
                  } else {
                    double total = marks1 + marks2 + marks3;
                    double avg = (total / 3.0);
                    System.out.printf("-".repeat(40));
                    System.out.printf(
                      "\n| Name: %s%-31s%s|",
                      blueBoldColor,
                      name.toUpperCase(),
                      resetColor
                    );
                    System.out.printf("\n| Age: %d %-29s|\n", age, "years old");

                    System.out.print("| Status: ");
                    if (avg >= 75) System.out.printf(
                      "%sDistinguished Pass%s%12s",
                      blueBoldColor,
                      resetBoldColor,
                      "|"
                    ); else if (avg >= 65) System.out.printf(
                      "%sCredit Pass%s%19s",
                      greenColor,
                      resetBoldColor,
                      "|"
                    ); else if (avg >= 55) System.out.printf(
                      "%sPass%s%26s",
                      yellowColor,
                      resetBoldColor,
                      "|"
                    ); else {
                      System.out.printf(
                        "%sFail%s%26s",
                        redBoldColor,
                        resetBoldColor,
                        "|"
                      );
                    }

                    System.out.printf(
                      "\n%s| Total: %.2f             Avg: %.2f%s|\n",
                      resetBoldColor,
                      total,
                      avg,
                      "%"
                    );
                    System.out.printf("-".repeat(40));
                    System.out.printf(
                      "\n| Subject | Marks |       Status       |\n"
                    );
                    System.out.printf(
                      "\n| %s%03d  | %.2f |",
                      subject1.substring(0, 3),
                      Integer.valueOf(subject1.substring(3)),
                      marks1
                    );

                    if (marks1 >= 75) System.out.printf(
                      " %sDistinguished Pass%s |",
                      blueBoldColor,
                      resetBoldColor
                    ); else if (marks1 >= 65) System.out.printf(
                      "     %sCredit Pass %s   |",
                      greenColor,
                      resetBoldColor
                    ); else if (marks1 >= 55) System.out.printf(
                      "       %sPass%s         |",
                      yellowColor,
                      resetBoldColor
                    ); else {
                      System.out.printf(
                        "       %sFail         %s|",
                        redBoldColor,
                        resetBoldColor
                      );
                    }

                    System.out.printf(
                      "\n| %s%03d  | %.2f |",
                      subject2.substring(0, 3),
                      Integer.valueOf(subject2.substring(3)),
                      marks2
                    );

                    if (marks2 >= 75) System.out.printf(
                      " %sDistinguished Pass%s |",
                      blueBoldColor,
                      resetBoldColor
                    ); else if (marks2 >= 65) System.out.printf(
                      "     %sCredit Pass %s   |",
                      greenColor,
                      resetBoldColor
                    ); else if (marks2 >= 55) System.out.printf(
                      "       %sPass%s         |",
                      yellowColor,
                      resetBoldColor
                    ); else {
                      System.out.printf(
                        "       %sFail         %s|",
                        redBoldColor,
                        resetBoldColor
                      );
                    }

                    System.out.printf(
                      "\n| %s%03d  | %.2f |",
                      subject3.substring(0, 3),
                      Integer.valueOf(subject3.substring(3)),
                      marks3
                    );

                    if (marks3 >= 75) System.out.printf(
                      " %sDistinguished Pass%s |\n",
                      blueBoldColor,
                      resetBoldColor
                    ); else if (marks3 >= 65) System.out.printf(
                      "     %sCredit Pass %s   |\n",
                      greenColor,
                      resetBoldColor
                    ); else if (marks3 >= 55) System.out.printf(
                      "       %sPass%s         |\n",
                      yellowColor,
                      resetBoldColor
                    ); else {
                      System.out.printf(
                        "       %sFail         %s|\n",
                        redBoldColor,
                        resetBoldColor
                      );
                    }

                    System.out.printf("-".repeat(40));
                    System.out.println();
                  }
                } else {
                  System.out.printf(
                    "%sInvalid Subject3%s\n",
                    redColor,
                    resetColor
                  );
                  return;
                }
              }
            } else {
              System.out.printf("%sInvalid Subject2%s\n", redColor, resetColor);
              return;
            }
          }
        } else {
          System.out.printf("%sInvalid Subject%s \n", redColor, resetColor);
          return;
        }
      }
    } else {
      System.out.printf("%sInvalid Name%s \n", redColor, resetColor);
      return;
    }
  }
}
