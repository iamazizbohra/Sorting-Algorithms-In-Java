import exception.ElementsNotFoundException;
import exception.SortingAlgorithmNotFound;
import sort.Sortable;

public class SortingService {
    private int[] elements;
    private Sortable sortingAlgorithm;

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public void setSortingAlgorithm(Sortable sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort(int... varargs) throws ElementsNotFoundException, SortingAlgorithmNotFound {
        if (elements.length == 0) {
            throw new ElementsNotFoundException("Please set elements to sort");
        }

        if (sortingAlgorithm == null) {
            throw new SortingAlgorithmNotFound("Please set sorting algorithm");
        }

        this.sortingAlgorithm.sort(this.elements, varargs);
    }
}
