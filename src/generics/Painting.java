package generics;

import java.util.List;

public class Painting <T extends Paintable>{
    private List<T> stuffsToPaint;

    public void paint (T stuff) {
        this.stuffsToPaint.add(stuff);
    }
}

