import javax.swing.*;

public class SmallestNumber {

    int smallestNumber = 0;
    int temp;


    public int getSmallestNumber() {
        String number = JOptionPane.showInputDialog("Enter NumberLength or n");
        int n = Integer.parseInt(number);

        String temporaryNumber = JOptionPane.showInputDialog("Enter Temporary Number or Temp");
        temp = Integer.parseInt(temporaryNumber);

        smallestNumber = temp; // lets assume that the smallestNumber = temporaryNumber.

        int i = 2;// we have already given temp a value already.
        for (i = 2; i <= n; i++) {

            temporaryNumber = JOptionPane.showInputDialog("Enter Temporary Number or Temp");
            temp = Integer.parseInt(temporaryNumber);
            if (temp < smallestNumber) {
                smallestNumber = temp;
            }

        }
        return smallestNumber;

           }
    }

