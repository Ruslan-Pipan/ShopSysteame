package com.shop.systeme.services.slider;

import java.util.List;

public interface SliderFiller {
    List<Slide> getSlider();
    void addSlide(Slide slider);
    void removeSlide(Slide slide);
    void removeSlide(int index);
}
