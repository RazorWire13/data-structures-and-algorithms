package fifoanimalshelter;

import stacksandqueues.PseudoQueue;

public class FIFOAnimalShelter<T> {

    public FIFOAnimalShelter() {
        this.catQue = new PseudoQueue<T>();
        this.dogQue = new PseudoQueue<T>();
    }

    PseudoQueue<T> catQue;
    PseudoQueue<T> dogQue;

    public static void main(String[] args) {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue("cat");
        testQueue.enqueue("dog");
        testQueue.enqueue("cat");
        testQueue.enqueue("cat");
        testQueue.dequeue();
    }

    // method takes in a value 'animal' and routes it to the proper queue
    public void enqueue(T animal) {
        if (animal == "cat" ) {
            catQue.enqueue(animal);
        } else {
            if (animal == "dog") {
                dogQue.enqueue(animal);
            }
        }
    }

    public T dequeue(T pref) {
        if (pref == "cat") {
            catQue.dequeue();
        } else {
            if (pref == "dog") {
                dogQue.dequeue();
            }
        }
        return null;
    }
}
