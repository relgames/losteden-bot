package com.losteden.output; 

import com.jacob.com.*;

public class AutoItX3 extends IAutoItX3 {

    public static final String componentName = "clsid:{1A671297-FA74-4422-80FA-6C5D8CE4DE04}";

    public AutoItX3() {
        super(componentName);
    }

    public AutoItX3(Dispatch d) {
        super(d);
    }
}
