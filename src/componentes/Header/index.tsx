import React from 'react';
import { Text, View } from 'react-native';
import { styles } from './styles';
import Bell from '../icons/Bell';

function Header(): React.JSX.Element {
    return (
        <View style={styles.header}>
            <Bell />
        </View>
    );
}

export default Header;
