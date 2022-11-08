import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import * as React from 'react';
import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from '@react-navigation/native';
import Inicio from './Components/inicio';
import  Crosswords  from './Components/crosswords';
import Quizz  from './Components/quizz';
import Screen1 from './Components/screen1';

// npx expo install react-native-gesture-handler react-native-reanimated
export default function App() {
  const Stack = createStackNavigator();

  return (
    <NavigationContainer>
      <Stack.Navigator options="false">
        <Stack.Screen name="Home" component={Inicio} />
        <Stack.Screen name="Screen1" component={Screen1}/>
      </Stack.Navigator>
    </NavigationContainer>

  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
