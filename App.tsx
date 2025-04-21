import React from 'react';
import {
  View,
} from 'react-native';
import Header from './src/componentes/Header';
import Content from './src/componentes/Content';


function App(): React.JSX.Element {
  return (
    <View>
      <Header />
      <Content />
    </View>
  );
}

export default App;
