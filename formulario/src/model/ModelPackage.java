/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.FormularioImpl <em>Formulario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FormularioImpl
	 * @see model.impl.ModelPackageImpl#getFormulario()
	 * @generated
	 */
	int FORMULARIO = 0;

	/**
	 * The feature id for the '<em><b>Trata Erro</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TRATA_ERRO = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TITULO = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__NOME = 2;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__SOBRENOME = 3;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__CEP = 4;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__CPF = 5;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__ENDERECO = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__PHONE = 8;

	/**
	 * The number of structural features of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Verifica CPF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___VERIFICA_CPF = 0;

	/**
	 * The operation id for the '<em>Verifica CEP</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___VERIFICA_CEP = 1;

	/**
	 * The operation id for the '<em>Verifica Campos Obrigatorios</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___VERIFICA_CAMPOS_OBRIGATORIOS = 2;

	/**
	 * The operation id for the '<em>Informa Erro</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___INFORMA_ERRO = 3;

	/**
	 * The operation id for the '<em>Envia Formulario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___ENVIA_FORMULARIO = 4;

	/**
	 * The number of operations of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.TrataErroImpl <em>Trata Erro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TrataErroImpl
	 * @see model.impl.ModelPackageImpl#getTrataErro()
	 * @generated
	 */
	int TRATA_ERRO = 1;

	/**
	 * The feature id for the '<em><b>Codigo Erro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRATA_ERRO__CODIGO_ERRO = 0;

	/**
	 * The number of structural features of the '<em>Trata Erro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRATA_ERRO_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Mostra Mensagem</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRATA_ERRO___MOSTRA_MENSAGEM = 0;

	/**
	 * The number of operations of the '<em>Trata Erro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRATA_ERRO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.UsuárioImpl <em>Usuário</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UsuárioImpl
	 * @see model.impl.ModelPackageImpl#getUsuário()
	 * @generated
	 */
	int USUÁRIO = 2;

	/**
	 * The feature id for the '<em><b>Formulario</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__FORMULARIO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Endereco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__ENDERECO = 3;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__CEP = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__TITULO = 5;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__SOBRENOME = 6;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__CPF = 7;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO__PHONE = 8;

	/**
	 * The number of structural features of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Preenche Formulario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO___PREENCHE_FORMULARIO = 0;

	/**
	 * The number of operations of the '<em>Usuário</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUÁRIO_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link model.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulario</em>'.
	 * @see model.Formulario
	 * @generated
	 */
	EClass getFormulario();

	/**
	 * Returns the meta object for the reference '{@link model.Formulario#getTrataErro <em>Trata Erro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trata Erro</em>'.
	 * @see model.Formulario#getTrataErro()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_TrataErro();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see model.Formulario#getTitulo()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Formulario#getNome()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getSobrenome <em>Sobrenome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sobrenome</em>'.
	 * @see model.Formulario#getSobrenome()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Sobrenome();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see model.Formulario#getCep()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Cep();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see model.Formulario#getCpf()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco</em>'.
	 * @see model.Formulario#getEndereco()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Endereco();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see model.Formulario#getEmail()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Email();

	/**
	 * Returns the meta object for the attribute '{@link model.Formulario#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see model.Formulario#getPhone()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Phone();

	/**
	 * Returns the meta object for the '{@link model.Formulario#VerificaCPF() <em>Verifica CPF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verifica CPF</em>' operation.
	 * @see model.Formulario#VerificaCPF()
	 * @generated
	 */
	EOperation getFormulario__VerificaCPF();

	/**
	 * Returns the meta object for the '{@link model.Formulario#VerificaCEP() <em>Verifica CEP</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verifica CEP</em>' operation.
	 * @see model.Formulario#VerificaCEP()
	 * @generated
	 */
	EOperation getFormulario__VerificaCEP();

	/**
	 * Returns the meta object for the '{@link model.Formulario#VerificaCamposObrigatorios() <em>Verifica Campos Obrigatorios</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verifica Campos Obrigatorios</em>' operation.
	 * @see model.Formulario#VerificaCamposObrigatorios()
	 * @generated
	 */
	EOperation getFormulario__VerificaCamposObrigatorios();

	/**
	 * Returns the meta object for the '{@link model.Formulario#InformaErro() <em>Informa Erro</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Informa Erro</em>' operation.
	 * @see model.Formulario#InformaErro()
	 * @generated
	 */
	EOperation getFormulario__InformaErro();

	/**
	 * Returns the meta object for the '{@link model.Formulario#EnviaFormulario() <em>Envia Formulario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Envia Formulario</em>' operation.
	 * @see model.Formulario#EnviaFormulario()
	 * @generated
	 */
	EOperation getFormulario__EnviaFormulario();

	/**
	 * Returns the meta object for class '{@link model.TrataErro <em>Trata Erro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trata Erro</em>'.
	 * @see model.TrataErro
	 * @generated
	 */
	EClass getTrataErro();

	/**
	 * Returns the meta object for the attribute '{@link model.TrataErro#getCodigoErro <em>Codigo Erro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Erro</em>'.
	 * @see model.TrataErro#getCodigoErro()
	 * @see #getTrataErro()
	 * @generated
	 */
	EAttribute getTrataErro_CodigoErro();

	/**
	 * Returns the meta object for the '{@link model.TrataErro#MostraMensagem() <em>Mostra Mensagem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Mostra Mensagem</em>' operation.
	 * @see model.TrataErro#MostraMensagem()
	 * @generated
	 */
	EOperation getTrataErro__MostraMensagem();

	/**
	 * Returns the meta object for class '{@link model.Usuário <em>Usuário</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuário</em>'.
	 * @see model.Usuário
	 * @generated
	 */
	EClass getUsuário();

	/**
	 * Returns the meta object for the reference list '{@link model.Usuário#getFormulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formulario</em>'.
	 * @see model.Usuário#getFormulario()
	 * @see #getUsuário()
	 * @generated
	 */
	EReference getUsuário_Formulario();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see model.Usuário#getNome()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Nome();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see model.Usuário#getEmail()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Email();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getEndereco <em>Endereco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco</em>'.
	 * @see model.Usuário#getEndereco()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Endereco();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see model.Usuário#getCep()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Cep();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see model.Usuário#getTitulo()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getSobrenome <em>Sobrenome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sobrenome</em>'.
	 * @see model.Usuário#getSobrenome()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Sobrenome();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see model.Usuário#getCpf()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link model.Usuário#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see model.Usuário#getPhone()
	 * @see #getUsuário()
	 * @generated
	 */
	EAttribute getUsuário_Phone();

	/**
	 * Returns the meta object for the '{@link model.Usuário#PreencheFormulario() <em>Preenche Formulario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Preenche Formulario</em>' operation.
	 * @see model.Usuário#PreencheFormulario()
	 * @generated
	 */
	EOperation getUsuário__PreencheFormulario();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.FormularioImpl <em>Formulario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FormularioImpl
		 * @see model.impl.ModelPackageImpl#getFormulario()
		 * @generated
		 */
		EClass FORMULARIO = eINSTANCE.getFormulario();

		/**
		 * The meta object literal for the '<em><b>Trata Erro</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__TRATA_ERRO = eINSTANCE.getFormulario_TrataErro();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TITULO = eINSTANCE.getFormulario_Titulo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__NOME = eINSTANCE.getFormulario_Nome();

		/**
		 * The meta object literal for the '<em><b>Sobrenome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__SOBRENOME = eINSTANCE.getFormulario_Sobrenome();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__CEP = eINSTANCE.getFormulario_Cep();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__CPF = eINSTANCE.getFormulario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__ENDERECO = eINSTANCE.getFormulario_Endereco();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__EMAIL = eINSTANCE.getFormulario_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__PHONE = eINSTANCE.getFormulario_Phone();

		/**
		 * The meta object literal for the '<em><b>Verifica CPF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___VERIFICA_CPF = eINSTANCE.getFormulario__VerificaCPF();

		/**
		 * The meta object literal for the '<em><b>Verifica CEP</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___VERIFICA_CEP = eINSTANCE.getFormulario__VerificaCEP();

		/**
		 * The meta object literal for the '<em><b>Verifica Campos Obrigatorios</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___VERIFICA_CAMPOS_OBRIGATORIOS = eINSTANCE.getFormulario__VerificaCamposObrigatorios();

		/**
		 * The meta object literal for the '<em><b>Informa Erro</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___INFORMA_ERRO = eINSTANCE.getFormulario__InformaErro();

		/**
		 * The meta object literal for the '<em><b>Envia Formulario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___ENVIA_FORMULARIO = eINSTANCE.getFormulario__EnviaFormulario();

		/**
		 * The meta object literal for the '{@link model.impl.TrataErroImpl <em>Trata Erro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TrataErroImpl
		 * @see model.impl.ModelPackageImpl#getTrataErro()
		 * @generated
		 */
		EClass TRATA_ERRO = eINSTANCE.getTrataErro();

		/**
		 * The meta object literal for the '<em><b>Codigo Erro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRATA_ERRO__CODIGO_ERRO = eINSTANCE.getTrataErro_CodigoErro();

		/**
		 * The meta object literal for the '<em><b>Mostra Mensagem</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRATA_ERRO___MOSTRA_MENSAGEM = eINSTANCE.getTrataErro__MostraMensagem();

		/**
		 * The meta object literal for the '{@link model.impl.UsuárioImpl <em>Usuário</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.UsuárioImpl
		 * @see model.impl.ModelPackageImpl#getUsuário()
		 * @generated
		 */
		EClass USUÁRIO = eINSTANCE.getUsuário();

		/**
		 * The meta object literal for the '<em><b>Formulario</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUÁRIO__FORMULARIO = eINSTANCE.getUsuário_Formulario();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__NOME = eINSTANCE.getUsuário_Nome();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__EMAIL = eINSTANCE.getUsuário_Email();

		/**
		 * The meta object literal for the '<em><b>Endereco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__ENDERECO = eINSTANCE.getUsuário_Endereco();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__CEP = eINSTANCE.getUsuário_Cep();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__TITULO = eINSTANCE.getUsuário_Titulo();

		/**
		 * The meta object literal for the '<em><b>Sobrenome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__SOBRENOME = eINSTANCE.getUsuário_Sobrenome();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__CPF = eINSTANCE.getUsuário_Cpf();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUÁRIO__PHONE = eINSTANCE.getUsuário_Phone();

		/**
		 * The meta object literal for the '<em><b>Preenche Formulario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUÁRIO___PREENCHE_FORMULARIO = eINSTANCE.getUsuário__PreencheFormulario();

	}

} //ModelPackage
