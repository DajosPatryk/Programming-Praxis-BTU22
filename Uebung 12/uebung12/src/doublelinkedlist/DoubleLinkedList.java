package doublelinkedlist;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NameNotFoundException;

public class DoubleLinkedList<T> implements doublelinkedlist.List<T> {
    private Node<T> val0;

    /**
     * A single element.
     */
    class Node<T> {
        private T val;
        private Node<T> prev = null;
        private Node<T> next = null;

        public Node(T obj, Node<T> next, Node<T> prev) {
            this.val = obj;
            this.next = next;
            this.prev = prev;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }

    }

    public DoubleLinkedList(T obj) {
        this.val0 = new Node<T>(obj, null, null);
    }

    /**
     * Adds a single element to the front of the list.
     * Type obj : element to add.
     */
    public void add(T obj) {
        Node<T> tempval = val0;
        if (val0 != null) {
            while (tempval.getNext() != null) {
                tempval = tempval.getNext();
            }
            tempval.setNext(new Node<T>(obj, null, tempval));
        } else {
            val0 = new Node<T>(obj, null, null);
        }
    }

    /**
     * Inserts a single element on the position given.
     * T obj : element to insert.
     * int index : position in the list.
     */
    public void insert(T obj, int index) {
        if (index >= 0 && val0 != null) {
            if (index == 0) {
                Node<T> tempval = val0;
                tempval.setPrev(new Node<T>(obj, tempval, null));
                val0 = tempval.getPrev();
            } else {
                Node<T> tempval = val0;
                for (int i = 0; i < index; i++) {
                    try {
                        tempval = tempval.getNext();
                    } catch (Exception e) {
                        
                    }
                }
                tempval.setVal(obj);
            }
        } else if (val0 == null && index == 0) {
            val0 = new Node<T>(obj, null, null);
        } else {
            
        }
    }

    /**
     * Returns an object at a given position. Returns null if the position doesn't exist. #
     * int index : position in the list.
    */
    public T get(int index) {
        if (index >= 0 && val0 != null) {
            Node<T> tempval = val0;
            for (int i = 0; i < index; i++) {
                try {
                    tempval = tempval.getNext();
                } catch (Exception e) {

                }
            }
            return tempval.getVal();
        } else if (val0 == null && index == 0) {
            return null;
        } else {
            return null;
        }
    }

    /**
     * Deletes an element in the list and shrinks the list. The deleted position will therefore be turned into the
     * elements next value.
     * int index : position in the list.
     */
    public void delete(int index) {
        if (index >= 0 && val0 != null) {
            Node<T> tempval = val0;
            for (int i = 0; i < index; i++) {
                try {
                    tempval = tempval.getNext();
                } catch (Exception e) {
                    
                }
            }
            if (tempval.getNext() == null) {
                if (tempval.getPrev() == null) {
                    val0 = null;
                }
                tempval.getPrev().setNext(null);
                tempval = null;
                while (tempval.getPrev() != null) {
                    tempval = tempval.getPrev();
                }
                val0 = tempval;
            } else if (tempval.getPrev() == null) {
                val0 = tempval.getNext();
                val0.setPrev(null);
            } else {
                Node<T> tempprev = tempval.getPrev();
                Node<T> tempnext = tempval.getNext();
                tempval = tempval.getPrev();
                tempval.setNext(tempnext);
                tempval = tempval.getNext();
                tempval.setPrev(tempprev);
                while (tempval.getPrev() != null) {
                    tempval = tempval.getPrev();
                }
                val0 = tempval;
            }
        } else {
            
        }
    }

    /**
     * Searches for the index of specified Object.
     * Return : -1 if nothing was found.
     */
    public int indexOf(T obj) {
        if (val0 != null) {
            Node<T> tempval = val0;
            for (int i = 0; i < this.length(); i++) {
                if (this.get(i).equals(obj)) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    /**
     * Compares 2 double linked lists and returns a boolean.
     * Object obj : a list to compare with.
     * Return : true/false.
     */
    public boolean equals(Object obj) {
        if (obj.getClass().getName() == "doublelinkedlist.DoubleLinkedList") {
            if (((DoubleLinkedList) obj).length() == this.length()) {
                for (int i = 0; i < this.length(); i++) {
                    if (!((DoubleLinkedList) obj).get(i).equals(this.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the size of the length of the list.
     * Return : 0 if the list is empty. 
     */
    public int length() {
        int counter = 0;
        Node<T> tempval = val0;
        if (tempval != null) {
            counter++;
            while (tempval.getNext() != null) {
                tempval = tempval.getNext();
                counter++;
            }
        }
        return counter;
    }

    /**
     * Prints this list out to a String.
     * Return : String of this list.
     */
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.length() - 1; i++) {
            result = result + this.get(i) + ", ";
        }
        result = result + this.get(this.length() - 1) + " ]";
        return result;
    }
}
