package stack_and_queue.PetQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class PetStack {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;


    public PetStack(Queue<PetEnterQueue> dogQ, Queue<PetEnterQueue> catQ) {
        this.dogQ = dogQ;
        this.catQ = catQ;
        this.count = 0;

    }

    public void add(Pet pet) {
        PetEnterQueue petEnterQueue = new PetEnterQueue(pet, count++);
        if (pet.equals("dog")) {
            dogQ.add(petEnterQueue);
        } else {
            catQ.add(petEnterQueue);
        }
    }

    public List<Pet> pollAll() {
        List<Pet> petEnterQueueList = new ArrayList<>();
        while (!this.dogQ.isEmpty() || !this.catQ.isEmpty()) {
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
                petEnterQueueList.add(this.dogQ.poll().getPet());

            } else {
                petEnterQueueList.add(this.catQ.poll().getPet());

            }
        }
    }
}
