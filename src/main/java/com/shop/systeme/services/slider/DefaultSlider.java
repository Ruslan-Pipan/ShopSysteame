package com.shop.systeme.services.slider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultSlider implements SliderFiller {

    @Autowired
    private List<Slide> sliders;

    @Override
    public List<Slide> getSlider() {
        return sliders;
    }

    @Override
    public void addSlide(Slide slide) {
        sliders.add(slide);
    }

    @Override
    public void removeSlide(Slide slide) {
        sliders.remove(slide);
    }

    @Override
    public void removeSlide(int index) {
        sliders.remove(index);
    }


}
