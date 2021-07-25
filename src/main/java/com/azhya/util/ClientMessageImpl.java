package com.azhya.util;

public class ClientMessageImpl {
	public static final ClientMessage SUCCESSFULLY_CREATED = new ClientMessage("Successfully created");
	public static final ClientMessage CREATION_FAILED = new ClientMessage("Failed creation");
	public static final ClientMessage SUCCESSFULLY_DELETED = new ClientMessage("Successfully deleted");
	public static final ClientMessage DELETION_FAILED = new ClientMessage("Failed deletion");
}
