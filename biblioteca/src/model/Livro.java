/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Livro#getISBN <em>ISBN</em>}</li>
 *   <li>{@link model.Livro#getEdicao <em>Edicao</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getLivro()
 * @model
 * @generated
 */
public interface Livro extends Publicacao {
	/**
	 * Returns the value of the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISBN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISBN</em>' attribute.
	 * @see #setISBN(int)
	 * @see model.ModelPackage#getLivro_ISBN()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getISBN();

	/**
	 * Sets the value of the '{@link model.Livro#getISBN <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISBN</em>' attribute.
	 * @see #getISBN()
	 * @generated
	 */
	void setISBN(int value);

	/**
	 * Returns the value of the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edicao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edicao</em>' attribute.
	 * @see #setEdicao(int)
	 * @see model.ModelPackage#getLivro_Edicao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getEdicao();

	/**
	 * Sets the value of the '{@link model.Livro#getEdicao <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edicao</em>' attribute.
	 * @see #getEdicao()
	 * @generated
	 */
	void setEdicao(int value);

} // Livro
