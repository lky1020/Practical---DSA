
public interface SetInterface<T> {
        
    /*
    boolean add(T newElement)
    Description: Add a new element to the set
    Pre-condition: valid newElement been passed
    Post-condition: the newElement has been added to the set
    Return: true if success add new element to the set, false opposite.
    */
    public boolean add(T newElement);
    
    /*
    boolean remove(T anElement)
    Description: Remove an element from the set (if contain > 1 that match the anElement, will only remove one of them)
    Pre-condition: valid newElement been passed
    Post-condition: the newElement has been remove from the set
    Return: true if success remove the element from the set, false opposite.
    */
    public boolean remove(T anElement);
    
    /*
    boolean checkSubset(Set anotherSet)
    Description: Check if another set is a subset of the current set
    Pre-condition: valid anotherSet of Set Object has been passed
    Post-condition: current set remain unchanged
    Return: true if another set is a subset of the current set, false opposite.
    */
    public boolean checkSubset(Set anotherSet);

    /*
    void union(Set anotherSet)
    Description: Add another set to the current set
    Pre-condition: valid anotherSet of Set Object has been passed
    Post-condition: the current set has been changed (new result after add)
    Return: void
    */
    public void union(Set anotherSet);

    /*
    Set intersection(Set anotherSet)
    Description: Returns a set with elements that are common in both the current set and the given set.
    Pre-condition: valid anotherSet of Set Object been passed
    Post-condition: current set remain unchanged
    Return: Set Object that contain the elements that are common in both current set and anotherSet
    */
    public Set intersection(Set anotherSet);
}
