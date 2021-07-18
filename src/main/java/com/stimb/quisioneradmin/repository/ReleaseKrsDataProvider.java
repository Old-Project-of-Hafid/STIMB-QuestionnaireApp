package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.ReleaseClass.ReleaseKrs;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 12/27/2015.
 */
public class ReleaseKrsDataProvider extends SortableDataProvider<ReleaseKrs,String> {

    protected int itemsPerPage = 10;
    protected List<ReleaseKrs> krses;
    public ReleaseKrsDataProvider(List<ReleaseKrs> krses){
        this.krses = krses;
    }

    protected List<ReleaseKrs> getData(){
        return krses;
    }

    public ReleaseKrsDataProvider(ReleaseKrs krses){
        this.krses.add(krses);
    }

    public ReleaseKrsDataProvider(){
        krses = new ArrayList<>();
    }
    @Override
    public Iterator<? extends ReleaseKrs> iterator(long first, long count) {
        final Sort sort;
        if (getSort() != null) {
            sort = new Sort(getSort().isAscending() ? Sort.Direction.ASC : Sort.Direction.DESC,
                    getSort().getProperty());
        } else {
            sort = new Sort("name");
        }
        final List<ReleaseKrs> cameras = krses;
                //new PageRequest((int) (first / itemsPerPage), itemsPerPage, sort));
        return cameras.iterator();
    }

    @Override
    public long size() {
        return krses.size();
    }

    @Override
    public IModel<ReleaseKrs> model(ReleaseKrs object) {
        return new Model<>(object);
    }
}
