package crisci.caterina.design_patterns.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Book implements HasPages{

    private List<Section> sections;

    @Override
    public Integer getPages() {
        return sections.stream().map(Section::getPages).reduce(0, Integer::sum);
    }

    @Override
    public void print() {
        sections.forEach(Section::print);

    }
}
