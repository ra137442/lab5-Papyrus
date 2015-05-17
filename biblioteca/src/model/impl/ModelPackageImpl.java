/**
 */
package model.impl;

import model.Aluno;
import model.Atendente;
import model.Biblioteca;
import model.Emprestimo;
import model.Exemplar;
import model.Funcionario;
import model.Livro;
import model.Manual;
import model.ModelFactory;
import model.ModelPackage;
import model.Periodico;
import model.Professor;
import model.Publicacao;
import model.Terminal;
import model.Tese;
import model.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emprestimoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atendenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tccEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_Biblioteca() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTerminal__MostraInfo() {
		return terminalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiblioteca() {
		return bibliotecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiblioteca__VerificaAtraso() {
		return bibliotecaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiblioteca__FazEmprestimo() {
		return bibliotecaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiblioteca__CalculaMulta() {
		return bibliotecaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiblioteca__CadastraUsuario() {
		return bibliotecaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivro() {
		return livroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_ISBN() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivro_Edicao() {
		return (EAttribute)livroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicacao() {
		return publicacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicacao_Biblioteca() {
		return (EReference)publicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Nome() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Autor() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Area() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExemplar_Biblioteca() {
		return (EReference)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Status() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_PeriodoEmprestimo() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodico() {
		return periodicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodico_Data() {
		return (EAttribute)periodicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTese() {
		return teseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTese_Orientador() {
		return (EAttribute)teseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsuario_Emprestimo() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Nome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_NumeroCadastro() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__FazReserva() {
		return usuarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__CancelaReserva() {
		return usuarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmprestimo() {
		return emprestimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmprestimo_Biblioteca() {
		return (EReference)emprestimoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmprestimo__SolicitaEmprestimo() {
		return emprestimoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_RA() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_Curso() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessor_Departamento() {
		return (EAttribute)professorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__BloquearExemplar() {
		return professorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__DesbloquearExemplar() {
		return professorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtendente() {
		return atendenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtendente_Cadastro() {
		return (EAttribute)atendenteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtendente_Setor() {
		return (EAttribute)atendenteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__IncluirExemplares() {
		return atendenteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__ExcluirExemplares() {
		return atendenteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtendente__AtualizarDados() {
		return atendenteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionario() {
		return funcionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncionario_Funcao() {
		return (EAttribute)funcionarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCC() {
		return tccEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		terminalEClass = createEClass(TERMINAL);
		createEReference(terminalEClass, TERMINAL__BIBLIOTECA);
		createEOperation(terminalEClass, TERMINAL___MOSTRA_INFO);

		bibliotecaEClass = createEClass(BIBLIOTECA);
		createEOperation(bibliotecaEClass, BIBLIOTECA___VERIFICA_ATRASO);
		createEOperation(bibliotecaEClass, BIBLIOTECA___FAZ_EMPRESTIMO);
		createEOperation(bibliotecaEClass, BIBLIOTECA___CALCULA_MULTA);
		createEOperation(bibliotecaEClass, BIBLIOTECA___CADASTRA_USUARIO);

		livroEClass = createEClass(LIVRO);
		createEAttribute(livroEClass, LIVRO__ISBN);
		createEAttribute(livroEClass, LIVRO__EDICAO);

		publicacaoEClass = createEClass(PUBLICACAO);
		createEReference(publicacaoEClass, PUBLICACAO__BIBLIOTECA);
		createEAttribute(publicacaoEClass, PUBLICACAO__NOME);
		createEAttribute(publicacaoEClass, PUBLICACAO__AUTOR);
		createEAttribute(publicacaoEClass, PUBLICACAO__AREA);

		exemplarEClass = createEClass(EXEMPLAR);
		createEReference(exemplarEClass, EXEMPLAR__BIBLIOTECA);
		createEAttribute(exemplarEClass, EXEMPLAR__STATUS);
		createEAttribute(exemplarEClass, EXEMPLAR__PERIODO_EMPRESTIMO);

		periodicoEClass = createEClass(PERIODICO);
		createEAttribute(periodicoEClass, PERIODICO__DATA);

		teseEClass = createEClass(TESE);
		createEAttribute(teseEClass, TESE__ORIENTADOR);

		manualEClass = createEClass(MANUAL);

		usuarioEClass = createEClass(USUARIO);
		createEReference(usuarioEClass, USUARIO__EMPRESTIMO);
		createEAttribute(usuarioEClass, USUARIO__NOME);
		createEAttribute(usuarioEClass, USUARIO__NUMERO_CADASTRO);
		createEOperation(usuarioEClass, USUARIO___FAZ_RESERVA);
		createEOperation(usuarioEClass, USUARIO___CANCELA_RESERVA);

		emprestimoEClass = createEClass(EMPRESTIMO);
		createEReference(emprestimoEClass, EMPRESTIMO__BIBLIOTECA);
		createEOperation(emprestimoEClass, EMPRESTIMO___SOLICITA_EMPRESTIMO);

		alunoEClass = createEClass(ALUNO);
		createEAttribute(alunoEClass, ALUNO__RA);
		createEAttribute(alunoEClass, ALUNO__CURSO);

		professorEClass = createEClass(PROFESSOR);
		createEAttribute(professorEClass, PROFESSOR__DEPARTAMENTO);
		createEOperation(professorEClass, PROFESSOR___BLOQUEAR_EXEMPLAR);
		createEOperation(professorEClass, PROFESSOR___DESBLOQUEAR_EXEMPLAR);

		atendenteEClass = createEClass(ATENDENTE);
		createEAttribute(atendenteEClass, ATENDENTE__CADASTRO);
		createEAttribute(atendenteEClass, ATENDENTE__SETOR);
		createEOperation(atendenteEClass, ATENDENTE___INCLUIR_EXEMPLARES);
		createEOperation(atendenteEClass, ATENDENTE___EXCLUIR_EXEMPLARES);
		createEOperation(atendenteEClass, ATENDENTE___ATUALIZAR_DADOS);

		funcionarioEClass = createEClass(FUNCIONARIO);
		createEAttribute(funcionarioEClass, FUNCIONARIO__FUNCAO);

		tccEClass = createEClass(TCC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		livroEClass.getESuperTypes().add(this.getPublicacao());
		periodicoEClass.getESuperTypes().add(this.getPublicacao());
		teseEClass.getESuperTypes().add(this.getPublicacao());
		manualEClass.getESuperTypes().add(this.getPublicacao());
		alunoEClass.getESuperTypes().add(this.getUsuario());
		professorEClass.getESuperTypes().add(this.getUsuario());
		atendenteEClass.getESuperTypes().add(this.getUsuario());
		funcionarioEClass.getESuperTypes().add(this.getUsuario());
		tccEClass.getESuperTypes().add(this.getPublicacao());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminal_Biblioteca(), this.getBiblioteca(), null, "biblioteca", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTerminal__MostraInfo(), null, "MostraInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bibliotecaEClass, Biblioteca.class, "Biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBiblioteca__VerificaAtraso(), null, "VerificaAtraso", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBiblioteca__FazEmprestimo(), null, "FazEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBiblioteca__CalculaMulta(), null, "CalculaMulta", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBiblioteca__CadastraUsuario(), null, "CadastraUsuario", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(livroEClass, Livro.class, "Livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivro_ISBN(), ecorePackage.getEInt(), "ISBN", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLivro_Edicao(), ecorePackage.getEInt(), "Edicao", null, 1, 1, Livro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(publicacaoEClass, Publicacao.class, "Publicacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicacao_Biblioteca(), this.getBiblioteca(), null, "biblioteca", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_Nome(), ecorePackage.getEString(), "Nome", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_Autor(), ecorePackage.getEString(), "Autor", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_Area(), ecorePackage.getEString(), "Area", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExemplar_Biblioteca(), this.getBiblioteca(), null, "biblioteca", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Status(), ecorePackage.getEString(), "Status", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_PeriodoEmprestimo(), ecorePackage.getEInt(), "PeriodoEmprestimo", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(periodicoEClass, Periodico.class, "Periodico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodico_Data(), ecorePackage.getEString(), "Data", null, 1, 1, Periodico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(teseEClass, Tese.class, "Tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTese_Orientador(), ecorePackage.getEString(), "Orientador", null, 1, 1, Tese.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsuario_Emprestimo(), this.getEmprestimo(), null, "emprestimo", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Nome(), ecorePackage.getEString(), "Nome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_NumeroCadastro(), ecorePackage.getEInt(), "NumeroCadastro", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUsuario__FazReserva(), null, "FazReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUsuario__CancelaReserva(), null, "CancelaReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(emprestimoEClass, Emprestimo.class, "Emprestimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmprestimo_Biblioteca(), this.getBiblioteca(), null, "biblioteca", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEmprestimo__SolicitaEmprestimo(), null, "SolicitaEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAluno_RA(), ecorePackage.getEInt(), "RA", null, 1, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAluno_Curso(), ecorePackage.getEString(), "Curso", null, 1, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessor_Departamento(), ecorePackage.getEString(), "Departamento", null, 1, 1, Professor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getProfessor__BloquearExemplar(), null, "BloquearExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProfessor__DesbloquearExemplar(), null, "DesbloquearExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(atendenteEClass, Atendente.class, "Atendente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtendente_Cadastro(), ecorePackage.getEInt(), "Cadastro", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAtendente_Setor(), ecorePackage.getEString(), "Setor", null, 1, 1, Atendente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAtendente__IncluirExemplares(), null, "IncluirExemplares", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__ExcluirExemplares(), null, "ExcluirExemplares", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAtendente__AtualizarDados(), null, "AtualizarDados", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(funcionarioEClass, Funcionario.class, "Funcionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncionario_Funcao(), ecorePackage.getEString(), "Funcao", null, 1, 1, Funcionario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tccEClass, model.TCC.class, "TCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
