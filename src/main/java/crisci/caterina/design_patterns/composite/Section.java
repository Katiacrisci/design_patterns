package crisci.caterina.design_patterns.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Section implements HasPages{

    private List<Subsection> subsections;

    @Override
    public Integer getPages() {
        return 0;
    }

    @Override
    public void print() {

    }
}
