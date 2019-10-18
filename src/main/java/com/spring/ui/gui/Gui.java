package com.spring.ui.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.springframework.stereotype.Component;
import javax.swing.JButton;

@Component("Gui")
public class Gui extends JFrame {
	
	private JPanel contentPane;
	
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1091, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 1055, 582);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setBounds(10, 11, 89, 23);
		panel_1.add(btnAdd);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.setBounds(109, 11, 89, 23);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(208, 11, 89, 23);
		panel_1.add(btnDelete);
		
		JButton btnGet = new JButton("get");
		btnGet.setBounds(307, 11, 89, 23);
		panel_1.add(btnGet);
		this.setVisible(true);
	}
}
