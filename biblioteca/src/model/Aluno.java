/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Aluno#getRA <em>RA</em>}</li>
 *   <li>{@link model.Aluno#getCurso <em>Curso</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>RA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RA</em>' attribute.
	 * @see #setRA(int)
	 * @see model.ModelPackage#getAluno_RA()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRA();

	/**
	 * Sets the value of the '{@link model.Aluno#getRA <em>RA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RA</em>' attribute.
	 * @see #getRA()
	 * @generated
	 */
	void setRA(int value);

	/**
	 * Returns the value of the '<em><b>Curso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curso</em>' attribute.
	 * @see #setCurso(String)
	 * @see model.ModelPackage#getAluno_Curso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCurso();

	/**
	 * Sets the value of the '{@link model.Aluno#getCurso <em>Curso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curso</em>' attribute.
	 * @see #getCurso()
	 * @generated
	 */
	void setCurso(String value);

} // Aluno
