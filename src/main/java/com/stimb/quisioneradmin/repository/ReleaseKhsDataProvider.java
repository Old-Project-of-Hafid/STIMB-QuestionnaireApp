package com.stimb.quisioneradmin.repository;

import com.stimb.quisioneradmin.ReleaseClass.ReleaseKhs;
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
public class ReleaseKhsDataProvider extends SortableDataProvider<ReleaseKhs, String> {

    protected int itemsPerPage = 10;
    List<ReleaseKhs> krses = new ArrayList<>();

    public double getIpk() {
        double sum = 0;
        double sumSKS = 0;
        for (int i = 0; i < krses.size(); i++) {
            int mark = 0;
            if (krses.get(i).getNilai()!= null) {
                if (krses.get(i).getNilai() == "A") {
                    mark = 4;
                } else if (krses.get(i).getNilai() == "B") {
                    mark = 3;
                } else if (krses.get(i).getNilai() == "C") {
                    mark = 2;
                } else if (krses.get(i).getNilai() == "D") {
                    mark = 1;
                } else if (krses.get(i).getNilai() == "E") {
                    mark = 0;
                }
                sum = sum + (mark * krses.get(i).getSksMataKuliah());
                sumSKS = sumSKS + krses.get(i).getSksMataKuliah();
            }
        }
        double ipk = sum/sumSKS;
        return ipk;
    }

    public double getTotalSks(){
        double sumSKS = 0;
        for (int i = 0; i < krses.size(); i++) {
            sumSKS = sumSKS + krses.get(i).getSksMataKuliah();
        }
        return sumSKS;
    }

    public ReleaseKhsDataProvider(List<ReleaseKhs> krses) {
        this.krses = krses;
    }

    public ReleaseKhsDataProvider(ReleaseKhs krses) {
        this.krses.add(krses);
    }

    public ReleaseKhsDataProvider() {
    }

    @Override
    public Iterator<? extends ReleaseKhs> iterator(long first, long count) {
        final Sort sort;
        if (getSort() != null) {
            sort = new Sort(getSort().isAscending() ? Sort.Direction.ASC : Sort.Direction.DESC,
                    getSort().getProperty());
        } else {
            sort = new Sort("name");
        }
        final List<ReleaseKhs> cameras = krses;
        //new PageRequest((int) (first / itemsPerPage), itemsPerPage, sort));
        return cameras.iterator();
    }

    @Override
    public long size() {
        return krses.size();
    }

    @Override
    public IModel<ReleaseKhs> model(ReleaseKhs object) {
        return new Model<>(object);
    }
}
