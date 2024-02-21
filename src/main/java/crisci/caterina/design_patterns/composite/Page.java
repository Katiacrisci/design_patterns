package crisci.caterina.design_patterns.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Page implements HasPages{

    private String words;

    @Override
    public Integer getPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(words);

    }
}
