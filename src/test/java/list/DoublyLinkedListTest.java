package list;

import list.DoublyLinkedList;
import org.junit.Before;

/**
 * Contains unit tests for methods contained within the DoublyLinkedList class.
 */
public class DoublyLinkedListTest extends SinglyLinkedListTest {

    public DoublyLinkedListTest() throws Exception {
        super();
    }

    @Before
    public void initialize() {
        this.list = new DoublyLinkedList();
    }

    @Override
    public void singlyLinkedListInsertGetFrontTest() {
        super.singlyLinkedListInsertGetFrontTest();
    }

    @Override
    public void singlyLinkedListInsertGetEndTest() {
        super.singlyLinkedListInsertGetEndTest();
    }

    @Override
    public void singlyLinkedListInsertGetAtTest() {
        super.singlyLinkedListInsertGetAtTest();
    }

    @Override
    public void singlyLinkedListRemoveFrontTest() {
        super.singlyLinkedListRemoveFrontTest();
    }

    @Override
    public void singlyLinkedListRemoveEndTest() {
        super.singlyLinkedListRemoveEndTest();
    }

    @Override
    public void singlyLinkedListRemoveAtTest() {
        super.singlyLinkedListRemoveAtTest();
    }

    @Override
    public void singlyLinkedListFindTest() {
        super.singlyLinkedListFindTest();
    }

    @Override
    public void singlyLinkedListToArrayTest() {
        super.singlyLinkedListToArrayTest();
    }

    @Override
    public void singlyLinkedListIsEmptyTest() {
        super.singlyLinkedListIsEmptyTest();
    }

    @Override
    public void singlyLinkedListGetSizeTest() {
        super.singlyLinkedListGetSizeTest();
    }


}
