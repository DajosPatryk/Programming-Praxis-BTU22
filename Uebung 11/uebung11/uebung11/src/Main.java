public class Main {
    public static void main(String[] args) {
        ListStack operation1 = new ListStack();
        ListStack operation2 = new ListStack();
        ListStack operation3 = new ListStack();

        //Füllt die Operationen aus.
        operation1.push(new Operand(5));
        operation1.push(new Operand(3));
        operation1.push(new Operator('*'));
        operation1.push(new Operand(2));
        operation1.push(new Operator('+'));

        operation2.push(new Operand(5));
        operation2.push(new Operand(3));
        operation2.push(new Operand(2));
        operation2.push(new Operator('-'));
        operation2.push(new Operator('*'));

        operation3.push(new Operand(5));
        operation3.push(new Operand(2));
        operation3.push(new Operator('-'));
        operation3.push(new Operand(3));
        operation3.push(new Operand(4));
        operation3.push(new Operator('+'));
        operation3.push(new Operator('*'));

        System.out.println("Rechnung 1: " + UpnAuswerter.calculate(operation1));
        System.out.println("Rechnung 2: " + UpnAuswerter.calculate(operation2));
        System.out.println("Rechnung 3: " + UpnAuswerter.calculate(operation3));
    }
}
