#include <iostream>
#include <vector>
#include <cstdlib>
#include "PriorityQueue.h"


using namespace std;
void print_tree(PriorityQueue<int> myq)
{
    int pos = 0;
    int level = 1;
    myq.print_tree_aux(pos, level);
}
int main()
{
  PriorityQueue<int> myq;

  // enter several values into myq;

  cout << endl;
  cout << "How many values? ";
  int k;
  cin >> k;
  srand(10); //seeds random number generator
  vector<int> myinputs;
  for (int i = 0; i < k; i++)
  {
      myinputs.push_back(rand()); //fills vector with random values
  }
  //values of k {12, 15, 100, 24, 19, 60, 112, 123, 18, 29, 78, 4};
  print_vector(myinputs);


  for (int i = 0; i < myinputs.size(); i++)
	  myq.push(myinputs[i]);

  // print out the contents of myq;
  // PriortyQueue has a function for this ...
  print_tree(myq);

  myq.pop();

  cout << endl << endl;
  print_tree(myq);

  return 0;
}
