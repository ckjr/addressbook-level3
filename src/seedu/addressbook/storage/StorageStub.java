package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Simplified class that serves as a substitute class for StorageFile in LogicTest
 */
public class StorageStub implements Storage {
    
    @Override
    public AddressBook load() throws StorageOperationException {
        return new AddressBook();
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {}

}
