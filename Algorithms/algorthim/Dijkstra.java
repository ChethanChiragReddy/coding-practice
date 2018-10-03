package com.chethan.algorthim;

import java.util.ArrayList;

class Dijkstra {

	private ArrayList<Fringe_element> fringe;
	private ArrayList<Node> nodes;
	private Utilities util;
	
	Dijkstra(ArrayList<Node> nodes) {
		this.nodes = nodes;
		this.fringe = new ArrayList<Fringe_element>();
		this.util = new Utilities();
	}
	
	public void solve(int source, int destiny, int show) {
		
		Fringe_element f = new Fringe_element(this.nodes.get(source), 0);
		this.fringe.add(f);
		f.visited.add(source);
		
		Fringe_element aux;
		
		while(this.fringe.size() > 0) {
			
			this.util.sort(this.fringe);
			if (show == 1)
				this.util.show_fringe(this.fringe);
			aux = this.fringe.remove(0);
			
			if (aux.n.id == destiny) {
				this.util.end(aux, "Dijkstra");
				return;
			}
			
			for (int i = 0; i < aux.n.childs.size(); i++) {
				f = new Fringe_element(nodes.get(aux.n.childs.get(i)), aux.f_function+aux.n.costs.get(i), util.copy(aux.visited));
				f.visited.add(aux.n.childs.get(i));
				this.fringe.add(f);
			}
			
		}
		
		System.out.println("ERROR! SOLUTION NOT FOUND!");
	}
}
