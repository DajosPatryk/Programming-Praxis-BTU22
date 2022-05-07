import java.util.ArrayList;
import java.util.List;

/**
 * Der UPN Auswerter kann UPN ausrechnen mit der Methode "calculate".
 */
public class UpnAuswerter {
    /**
     * Rechnet UPN aus.
     * @param list : Die Liste von Stacks.
     * @return : Das Ergebnis.
     */
    public static int calculate(ListStack list) {
        int temp1 = 0;
        int temp2 = 0;
        List<Operand> tempval = new ArrayList<Operand>();
        while (!list.isEmpty()) {
            while (list.peek().getClass().getName() == "Operand") {
                tempval.add((Operand)list.pop());
            }
            switch (((Operator)list.pop()).getVal()) {
                case '+':
                    temp1 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    temp2 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    tempval.add(new Operand(temp2 + temp1));
                    break;
                case '-':
                    temp1 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    temp2 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    tempval.add(new Operand(temp2 - temp1));
                    break;
                case '*': 
                    temp1 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    temp2 = tempval.get(tempval.size() - 1).getVal();
                    tempval.remove(tempval.size() - 1);
                    tempval.add(new Operand(temp2 * temp1));
                    break;
            }
        }
        return tempval.get(0).getVal();
    }
}
