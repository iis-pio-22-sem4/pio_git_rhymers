package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public defaultCountingOutRhymer GetStandardRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFalseRhymer() {
        return new defaultCountingOutRhymer();
    }

    @Override
    public defaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public defaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer();
    }

}

//alt -> - przejście do najbliższego na pasku otwartych plików pliku po prawej stronie
//alt <- - przejście do najbliższego na pasku otwartych plików pliku po lewej stronie