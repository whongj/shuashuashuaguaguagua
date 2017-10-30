package stack_and_queue.PetQuestion;

/**
 * Created by wanghongjie on 2017/10/30.
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }
    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {

        return count;
    }
    public String getPetType() {

        return this.pet.getPetType();
    }

}
