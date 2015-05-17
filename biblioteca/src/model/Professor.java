/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Professor#getDepartamento <em>Departamento</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Usuario {
	/**
	 * Returns the value of the '<em><b>Departamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departamento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departamento</em>' attribute.
	 * @see #setDepartamento(String)
	 * @see model.ModelPackage#getProfessor_Departamento()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDepartamento();

	/**
	 * Sets the value of the '{@link model.Professor#getDepartamento <em>Departamento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departamento</em>' attribute.
	 * @see #getDepartamento()
	 * @generated
	 */
	void setDepartamento(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void BloquearExemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DesbloquearExemplar();

} // Professor
