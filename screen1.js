import * as React from 'react';
import { createDrawerNavigator } from '@react-navigation/drawer';
import { NavigationContainer } from '@react-navigation/native';
import Crosswords from './crosswords';
import Quizz from './quizz';
import { StyleSheet, Text, View, Button } from 'react-native';
const Drawer = createDrawerNavigator();

export default function Screen1() {
    return (
        
            <Drawer.Navigator initialRouteName="Screen1">
                <Drawer.Screen name="Crosswords" component={Crosswords} />
                <Drawer.Screen name="Quizz" component={Quizz} />
            </Drawer.Navigator>
            // <Text> El drawer tira pero las screen no Jajajaja, Depresión.... </Text>
        
    )
}