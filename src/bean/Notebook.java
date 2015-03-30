package bean;

import java.io.Serializable;

public class Notebook implements Serializable {
	private static final long serialVersionUID = 3757893817259090136L;
	private String id;
	private String title;
	private String primaryNotebookUrl;

	/**
	 * Getter for the notebook id
	 * @return the notebook's directory-assigned id
	 */
	public String getId() {
		return id;
	}
	/**
	 * Setter for the notebook id
	 * @param id a notebook id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Getter for the notebook title
	 * @return the notebook's title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Setter for the notebook title
	 * @param title a notebook title, for example "blogs I read"
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Getter for the base URL of the notebook's primary server
	 * @return the base URL of the primary notebook service for this notebook,
	 * for example http::/mypc:8080/dino
	 */
	public String getPrimaryNotebookUrl() {
		return primaryNotebookUrl;
	}
	/**
	 * Setter for the base URL of a notebook's primary server
	 * @param primaryNotebookUrl a notebook service base URL, for example, http::/mypc:8080/dino
	 */
	public void setPrimaryNotebookUrl(String primaryNotebookUrl) {
		this.primaryNotebookUrl = primaryNotebookUrl;
	}
}
