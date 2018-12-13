package fifoanimalshelter;

import stacksandqueues.PseudoQueue;
import stacksandqueues.Queues;

public class FIFOAnimalShelter<T> extends Queues {

    public FIFOAnimalShelter() {
        this.catQue = new Queues<T>();
        this.dogQue = new Queues<T>();
        this.animalQue = new Queues<T>();
    }

    Queues<T> catQue;
    Queues<T> dogQue;
    Queues<T> animalQue;

    public static void main(String[] args) {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue("cat");
        testQueue.enqueue("dog");
        testQueue.enqueue("cat");
        testQueue.enqueue("cat");
        testQueue.dequeue();
    }

    // method takes in a value 'animal' and routes it to the proper queue
    public void enqueue(Animal species) {
        if (species instanceOf Cat) {
            catQue.enqueue(a);
        } else {
            if (species instanceOf Dog) {
                dogQue.enqueue(species);
            }
            animalQue.enqueue(species);
        }
    }

    public T dequeue(Animal pref) {
        if (pref instanceOf Cat) {
            catQue.dequeue();
        } else {
            if (pref instanceOf Dog) {
                dogQue.dequeue();
            }
        }
        return null;
    }
}
