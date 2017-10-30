package stack_and_queue.PetQuestion;

/**
 * Created by wanghongjie on 2017/10/30.
 */
class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }
    public String getPetType() {
        return this.type;
    }

}

class Dag extends Pet {

    public Dag() {
        super("Dog");
    }
}

class Cat extends Pet {
    public Cat() {
        super("Cat");
    }
}


