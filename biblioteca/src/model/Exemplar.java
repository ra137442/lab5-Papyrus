/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Exemplar#getBiblioteca <em>Biblioteca</em>}</li>
 *   <li>{@link model.Exemplar#getStatus <em>Status</em>}</li>
 *   <li>{@link model.Exemplar#getPeriodoEmprestimo <em>Periodo Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Biblioteca</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biblioteca</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biblioteca</em>' reference.
	 * @see #setBiblioteca(Biblioteca)
	 * @see model.ModelPackage#getExemplar_Biblioteca()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Biblioteca getBiblioteca();

	/**
	 * Sets the value of the '{@link model.Exemplar#getBiblioteca <em>Biblioteca</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Biblioteca</em>' reference.
	 * @see #getBiblioteca()
	 * @generated
	 */
	void setBiblioteca(Biblioteca value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see model.ModelPackage#getExemplar_Status()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link model.Exemplar#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Periodo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodo Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodo Emprestimo</em>' attribute.
	 * @see #setPeriodoEmprestimo(int)
	 * @see model.ModelPackage#getExemplar_PeriodoEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPeriodoEmprestimo();

	/**
	 * Sets the value of the '{@link model.Exemplar#getPeriodoEmprestimo <em>Periodo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodo Emprestimo</em>' attribute.
	 * @see #getPeriodoEmprestimo()
	 * @generated
	 */
	void setPeriodoEmprestimo(int value);

} // Exemplar
