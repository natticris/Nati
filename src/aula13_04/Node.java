/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_04;

/**
 *
 * @author Jose.Almeida
 */
// heap.java
// demonstrates heaps

import java.io.*;
////////////////////////////////////////////////////////////////
class Node
{
    private int iData; // itens de dados (chave)

    public Node(int key) // construtor da classe
        { iData = key; }

    public int getKey()
    { 
        return iData; 
    }

    public void setKey(int id)
    { 
        iData = id; 
    }

} 

    class Heap2
    {
        private Node[] heapArray;
        private int maxSize; // tamanho máximo do vetor
        private int currentSize; // número de nós do vetor
        
        public Heap2(int mx) // construtor
        {
            maxSize = mx;
            currentSize = 0;
            heapArray = new Node[maxSize]; // criar array
        }
        
        public boolean isEmpty()
        { 
            return currentSize==0; 
        }
        
        public boolean insert(int key)
        {
            if(currentSize==maxSize)
            return false;
            Node newNode = new Node(key);
            heapArray[currentSize] = newNode;
            trickleUp(currentSize++);
            return true;
        } // fim insert()
        // -------------------------------------------------------------
        public void trickleUp(int index) // Pinga para cima
        {
            int parent = (index-1) / 2;
            Node bottom = heapArray[index];
            while( index > 0 && heapArray[parent].getKey() < bottom.getKey() )
            {
                heapArray[index] = heapArray[parent]; // mover par baixo
                index = parent;
                parent = (parent-1) / 2;
            } // fim while
            heapArray[index] = bottom;
        } // fim trickleUp()
       
        public Node remove() // excluir o item com chave principal 
        { // (assume que a fila nao esta vazia)
            Node root = heapArray[0];
            heapArray[0] = heapArray[--currentSize];
            trickleDown(0);
            return root;
        } // fim remove()

    public void trickleDown(int index)
    {
        int largerChild;
        Node top = heapArray[index]; // salva raiz
        while(index < currentSize/2) // enquando o existir nó
        { // busca filhos
            int leftChild = 2*index+1;
            int rightChild = leftChild+1;
            // acha o filho maior
            if(rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey())
                largerChild = rightChild;
            else
                largerChild = leftChild;
            // top >= maior filho?
            if( top.getKey() >= heapArray[largerChild].getKey() )
                break;
            // jogar filho para cima
            heapArray[index] = heapArray[largerChild];
            index = largerChild; // vai para baixo
    } // fim while
    heapArray[index] = top; // raiz vai pra index
    } // fim trickleDown()
// -------------------------------------------------------------
    public boolean change(int index, int newValue)
    {
        if(index<0 || index>=currentSize)
            return false;
        
        int oldValue = heapArray[index].getKey(); // guarda antigo
        heapArray[index].setKey(newValue); // muda para o novo
        if(oldValue < newValue) // se maior,
            trickleUp(index); // jogar para cima
        else // if menor,
            trickleDown(index); // joga para baixo
        return true;
    } // fim change()
    // -------------------------------------------------------------
public void displayHeap()
{
    System.out.print("heapArray: "); // formato do vetor
    for(int m=0; m<currentSize; m++)
        if(heapArray[m] != null)
            System.out.print( heapArray[m].getKey() + " ");
        else
            System.out.print( "--" );
    
    System.out.println();
        // heap formato
    
    int nBlanks = 32;
    int itemsPerRow = 1;
    int column = 0;
    int j = 0; // item corrente
    String dots = "...............................";
    System.out.println(dots+dots); 
    
    while(currentSize > 0) // para cada item do heap
    {
        if(column == 0) // primeira linha
            for(int k=0; k < nBlanks; k++) // adiciona espaços
                System.out.print(" ");
            // display item
        System.out.print(heapArray[j].getKey());
        
        if(++j == currentSize) // terminou ?
            break;
        
        if(++column==itemsPerRow) // fim da linha?
        {
            nBlanks /= 2; // half the blanks
            itemsPerRow *= 2; // duas vezes o item 
            column = 0; // começa novamnete
            System.out.println(); // nova linha
        }
        else // proxima linha
            for(int k=0; k<nBlanks*2-2; k++)
                System.out.print(" "); // adiciona espaço
        } // fim for
    
    System.out.println("\n"+dots+dots); // adicionar pontos
    } // fim displayHeap()
// -------------------------------------------------------------
} // fim class Heap