package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {
    public String name;
    
    public abstract String speak();

    public static class AnimalNameComparator implements java.util.Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }
}
