/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atendente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Atendente#getCadastro <em>Cadastro</em>}</li>
 *   <li>{@link model.Atendente#getSetor <em>Setor</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAtendente()
 * @model
 * @generated
 */
public interface Atendente extends Usuario {
	/**
	 * Returns the value of the '<em><b>Cadastro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cadastro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cadastro</em>' attribute.
	 * @see #setCadastro(int)
	 * @see model.ModelPackage#getAtendente_Cadastro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCadastro();

	/**
	 * Sets the value of the '{@link model.Atendente#getCadastro <em>Cadastro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cadastro</em>' attribute.
	 * @see #getCadastro()
	 * @generated
	 */
	void setCadastro(int value);

	/**
	 * Returns the value of the '<em><b>Setor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setor</em>' attribute.
	 * @see #setSetor(String)
	 * @see model.ModelPackage#getAtendente_Setor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSetor();

	/**
	 * Sets the value of the '{@link model.Atendente#getSetor <em>Setor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setor</em>' attribute.
	 * @see #getSetor()
	 * @generated
	 */
	void setSetor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void IncluirExemplares();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ExcluirExemplares();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AtualizarDados();

} // Atendente
