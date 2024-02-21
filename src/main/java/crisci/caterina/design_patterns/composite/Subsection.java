package crisci.caterina.design_patterns.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Subsection implements HasPages {

    private List<Page> pages;

    @Override
    public Integer getPages() {
        return pages.stream().map(Page::getPages).reduce(0, Integer::sum);
    }

    @Override
    public void print() {

    }
}
